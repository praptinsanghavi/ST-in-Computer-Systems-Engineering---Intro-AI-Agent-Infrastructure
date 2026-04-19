---
description: Akka 2.10.17 - akka.cluster.VectorClock
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:44:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/VectorClock.html
title: Akka 2.10.17 - akka.cluster.VectorClock
---

# Akka 2.10.17 - akka.cluster.VectorClock

> **Summary:** Akka 2.10.17 - akka.cluster.VectorClock

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/cluster/index.html "Permalink")  package [cluster](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/cluster/ddata/index.html "Permalink")  package [ddata](ddata/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/metrics/index.html "Permalink")  package [metrics](metrics/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/pubsub/index.html "Permalink")  package [pubsub](pubsub/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/routing/index.html "Permalink")  package [routing](routing/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/sbr/index.html "Permalink")  package [sbr](sbr/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/sharding/index.html "Permalink")  package [sharding](sharding/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/singleton/index.html "Permalink")  package [singleton](singleton/index.html)Definition Classes[cluster](index.html)
- [**](../../akka/cluster/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[cluster](index.html)
- [Cluster](Cluster.html "This module is responsible cluster membership information.")
- [ClusterEvent](ClusterEvent$.html "Domain events published to the event bus.")
- [ClusterLogMarker](ClusterLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
- [ClusterMessage](ClusterMessage.html "Base trait for all cluster messages.")
- [ClusterNodeMBean](ClusterNodeMBean.html "Interface for the cluster JMX MBean.")
- [ClusterScope](ClusterScope.html)
- [ClusterSettings](ClusterSettings.html)
- [ConfigValidation](ConfigValidation.html)
- [DowningProvider](DowningProvider.html "API for plugins that will handle downing of cluster nodes.")
- [GossipEnvelope](GossipEnvelope$.html)
- [Invalid](Invalid.html)
- [JoinConfigCompatCheckCluster](JoinConfigCompatCheckCluster.html "INTERNAL API")
- [JoinConfigCompatChecker](JoinConfigCompatChecker.html)
- [Member](Member.html "Represents the address, current status, and roles of a cluster member node.")
- [MemberStatus](MemberStatus.html "Defines the current status of a cluster member node")
- [NoDowning](NoDowning.html "Default downing provider used when no provider is configured.")
- [UniqueAddress](UniqueAddress.html "Member identifier consisting of address and random uid.")
- [Valid](Valid$.html)
- VectorClock
c[akka](../index.html).[cluster](index.html)

# VectorClock[**](../../akka/cluster/VectorClock.html "Permalink")

### 

#### final  case class VectorClock(versions: [TreeMap](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/TreeMap.html#scala.collection.immutable.TreeMap)\[Node, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)] \= TreeMap.empty\[VectorClock.Node, Long]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Representation of a Vector\-based clock (counting clock), inspired by Lamport logical clocks.

```
Reference:
   1) Leslie Lamport (1978). "Time, clocks, and the ordering of events in a distributed system". Communications of the ACM 21 (7): 558-565.
   2) Friedemann Mattern (1988). "Virtual Time and Global States of Distributed Systems". Workshop on Parallel and Distributed Algorithms: pp. 215-226
```
Based on code from the 'vlock' VectorClock library by Coda Hale.

Annotations@SerialVersionUID() Source[VectorClock.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/VectorClock.scala#L73)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. VectorClock
2. Serializable
3. Product
4. Equals
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

1. [**](../../akka/cluster/VectorClock.html#<init>(versions:scala.collection.immutable.TreeMap[akka.cluster.VectorClock.Node,Long]):akka.cluster.VectorClock "Permalink")  new VectorClock(versions: [TreeMap](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/TreeMap.html#scala.collection.immutable.TreeMap)\[Node, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)] \= TreeMap.empty\[VectorClock.Node, Long])
### Value Members

1. [**](../../akka/cluster/VectorClock.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/VectorClock.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/VectorClock.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from VectorClock toany2stringadd\[VectorClock] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/cluster/VectorClock.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (VectorClock, B)ImplicitThis member is added by an implicit conversion from VectorClock toArrowAssoc\[VectorClock] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/cluster/VectorClock.html#:+(node:akka.cluster.VectorClock.Node):akka.cluster.VectorClock "Permalink")  def :\+(node: Node): VectorClockIncrement the version for the node passed as argument.

Increment the version for the node passed as argument. Returns a new VectorClock.
6. [**](../../akka/cluster/VectorClock.html#<(that:akka.cluster.VectorClock):Boolean "Permalink")  def \<(that: VectorClock): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if `this` is before `that` else false.
7. [**](../../akka/cluster/VectorClock.html#<>(that:akka.cluster.VectorClock):Boolean "Permalink")  def \<\>(that: VectorClock): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if `this` and `that` are concurrent else false.
8. [**](../../akka/cluster/VectorClock.html#==(that:akka.cluster.VectorClock):Boolean "Permalink")  def \=\=(that: VectorClock): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if this VectorClock has the same history as the 'that' VectorClock else false.
9. [**](../../akka/cluster/VectorClock.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../akka/cluster/VectorClock.html#>(that:akka.cluster.VectorClock):Boolean "Permalink")  def \>(that: VectorClock): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if `this` is after `that` else false.
11. [**](../../akka/cluster/VectorClock.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../akka/cluster/VectorClock.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/cluster/VectorClock.html#compareTo(that:akka.cluster.VectorClock):akka.cluster.VectorClock.Ordering "Permalink")  def compareTo(that: VectorClock): OrderingCompare two vector clocks.

Compare two vector clocks. The outcome will be one of the following:

```
1. Clock 1 is SAME (==)       as Clock 2 iff for all i c1(i) == c2(i)
2. Clock 1 is BEFORE (<)      Clock 2 iff for all i c1(i) <= c2(i) and there exist a j such that c1(j) < c2(j)
3. Clock 1 is AFTER (>)       Clock 2 iff for all i c1(i) >= c2(i) and there exist a j such that c1(j) > c2(j).
4. Clock 1 is CONCURRENT (<>) to Clock 2 otherwise.
```
14. [**](../../akka/cluster/VectorClock.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (VectorClock) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): VectorClockImplicitThis member is added by an implicit conversion from VectorClock toEnsuring\[VectorClock] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/cluster/VectorClock.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (VectorClock) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): VectorClockImplicitThis member is added by an implicit conversion from VectorClock toEnsuring\[VectorClock] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/cluster/VectorClock.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): VectorClockImplicitThis member is added by an implicit conversion from VectorClock toEnsuring\[VectorClock] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../akka/cluster/VectorClock.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): VectorClockImplicitThis member is added by an implicit conversion from VectorClock toEnsuring\[VectorClock] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../akka/cluster/VectorClock.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../akka/cluster/VectorClock.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/cluster/VectorClock.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../akka/cluster/VectorClock.html#merge(that:akka.cluster.VectorClock):akka.cluster.VectorClock "Permalink")  def merge(that: VectorClock): VectorClockMerges this VectorClock with another VectorClock.

Merges this VectorClock with another VectorClock. E.g. merges its versioned history.
22. [**](../../akka/cluster/VectorClock.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../akka/cluster/VectorClock.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../akka/cluster/VectorClock.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../akka/cluster/VectorClock.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
26. [**](../../akka/cluster/VectorClock.html#prune(removedNode:akka.cluster.VectorClock.Node):akka.cluster.VectorClock "Permalink")  def prune(removedNode: Node): VectorClock
27. [**](../../akka/cluster/VectorClock.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../akka/cluster/VectorClock.html#toString():String "Permalink")  def toString(): StringDefinition ClassesVectorClock → AnyRef → Any
29. [**](../../akka/cluster/VectorClock.html#versions:scala.collection.immutable.TreeMap[akka.cluster.VectorClock.Node,Long] "Permalink")  val versions: [TreeMap](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/TreeMap.html#scala.collection.immutable.TreeMap)\[Node, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]
30. [**](../../akka/cluster/VectorClock.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../akka/cluster/VectorClock.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../akka/cluster/VectorClock.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/cluster/VectorClock.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/cluster/VectorClock.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from VectorClock toStringFormat\[VectorClock] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/cluster/VectorClock.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (VectorClock, B)ImplicitThis member is added by an implicit conversion from VectorClock toArrowAssoc\[VectorClock] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromVectorClock to any2stringadd\[VectorClock]

### Inherited by implicit conversion StringFormat fromVectorClock to StringFormat\[VectorClock]

### Inherited by implicit conversion Ensuring fromVectorClock to Ensuring\[VectorClock]

### Inherited by implicit conversion ArrowAssoc fromVectorClock to ArrowAssoc\[VectorClock]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/Cluster$.html
- https://doc.akka.io/api/akka/current/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka/current/akka/cluster/ClusterEvent$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ClusterLogMarker$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ClusterMessage.html
- https://doc.akka.io/api/akka/current/akka/cluster/ClusterNodeMBean.html
- https://doc.akka.io/api/akka/current/akka/cluster/ClusterScope$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ClusterScope.html
- https://doc.akka.io/api/akka/current/akka/cluster/ClusterSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/ClusterSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/ConfigValidation.html
- https://doc.akka.io/api/akka/current/akka/cluster/DowningProvider.html
- https://doc.akka.io/api/akka/current/akka/cluster/GossipEnvelope$.html
- https://doc.akka.io/api/akka/current/akka/cluster/Invalid.html
- https://doc.akka.io/api/akka/current/akka/cluster/JoinConfigCompatCheckCluster.html
- https://doc.akka.io/api/akka/current/akka/cluster/JoinConfigCompatChecker$.html
- https://doc.akka.io/api/akka/current/akka/cluster/JoinConfigCompatChecker.html
- https://doc.akka.io/api/akka/current/akka/cluster/Member$.html
- https://doc.akka.io/api/akka/current/akka/cluster/Member.html
- https://doc.akka.io/api/akka/current/akka/cluster/MemberStatus$.html
- https://doc.akka.io/api/akka/current/akka/cluster/MemberStatus.html
- https://doc.akka.io/api/akka/current/akka/cluster/NoDowning.html
- https://doc.akka.io/api/akka/current/akka/cluster/UniqueAddress$.html
- https://doc.akka.io/api/akka/current/akka/cluster/UniqueAddress.html
- https://doc.akka.io/api/akka/current/akka/cluster/Valid$.html
- https://doc.akka.io/api/akka/current/akka/cluster/VectorClock.html
- https://doc.akka.io/api/akka/current/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sbr/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/VectorClock.html](https://doc.akka.io/api/akka/current/akka/cluster/VectorClock.html)*