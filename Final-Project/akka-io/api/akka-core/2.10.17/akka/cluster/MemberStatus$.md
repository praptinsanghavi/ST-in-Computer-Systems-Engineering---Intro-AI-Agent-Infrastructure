---
description: Akka 2.10.17 - akka.cluster.MemberStatus
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:14:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/MemberStatus$.html
title: Akka 2.10.17 - akka.cluster.MemberStatus
---

# Akka 2.10.17 - akka.cluster.MemberStatus

> **Summary:** Akka 2.10.17 - akka.cluster.MemberStatus

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
- [VectorClock](VectorClock.html "Representation of a Vector-based clock (counting clock), inspired by Lamport logical clocks.")
[o](MemberStatus.html "See companion class")[akka](../index.html).[cluster](index.html)

# [MemberStatus](MemberStatus.html "See companion class")[**](../../akka/cluster/MemberStatus$.html "Permalink")

### Companion [class MemberStatus](MemberStatus.html "See companion class")

#### object MemberStatus

Source[Member.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/Member.scala#L238)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MemberStatus
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/cluster/MemberStatus$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/MemberStatus$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/MemberStatus$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/cluster/MemberStatus$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/cluster/MemberStatus$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/cluster/MemberStatus$.html#down:akka.cluster.MemberStatus "Permalink")  def down: [MemberStatus](MemberStatus.html)Java API: retrieve the `Down` status singleton
7. [**](../../akka/cluster/MemberStatus$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../akka/cluster/MemberStatus$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../akka/cluster/MemberStatus$.html#exiting:akka.cluster.MemberStatus "Permalink")  def exiting: [MemberStatus](MemberStatus.html)Java API: retrieve the `Exiting` status singleton
10. [**](../../akka/cluster/MemberStatus$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../akka/cluster/MemberStatus$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/cluster/MemberStatus$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../akka/cluster/MemberStatus$.html#joining:akka.cluster.MemberStatus "Permalink")  def joining: [MemberStatus](MemberStatus.html)Java API: retrieve the `Joining` status singleton
14. [**](../../akka/cluster/MemberStatus$.html#leaving:akka.cluster.MemberStatus "Permalink")  def leaving: [MemberStatus](MemberStatus.html)Java API: retrieve the `Leaving` status singleton
15. [**](../../akka/cluster/MemberStatus$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/cluster/MemberStatus$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/cluster/MemberStatus$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../akka/cluster/MemberStatus$.html#removed:akka.cluster.MemberStatus "Permalink")  def removed: [MemberStatus](MemberStatus.html)Java API: retrieve the `Removed` status singleton
19. [**](../../akka/cluster/MemberStatus$.html#shutDown:akka.cluster.MemberStatus "Permalink")  def shutDown: [MemberStatus](MemberStatus.html)Java API: retrieve the `ShutDown` status singleton
20. [**](../../akka/cluster/MemberStatus$.html#shuttingDown:akka.cluster.MemberStatus "Permalink")  def shuttingDown: [MemberStatus](MemberStatus.html)Java API: retrieve the `ShuttingDown` status singleton
21. [**](../../akka/cluster/MemberStatus$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../akka/cluster/MemberStatus$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../akka/cluster/MemberStatus$.html#up:akka.cluster.MemberStatus "Permalink")  def up: [MemberStatus](MemberStatus.html)Java API: retrieve the `Up` status singleton
24. [**](../../akka/cluster/MemberStatus$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/cluster/MemberStatus$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../akka/cluster/MemberStatus$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/cluster/MemberStatus$.html#weaklyUp:akka.cluster.MemberStatus "Permalink")  def weaklyUp: [MemberStatus](MemberStatus.html)Java API: retrieve the `WeaklyUp` status singleton.
28. [**](../../akka/cluster/MemberStatus$$Down$.html "Permalink")  case object [Down](MemberStatus$$Down$.html) extends [MemberStatus](MemberStatus.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
29. [**](../../akka/cluster/MemberStatus$$Exiting$.html "Permalink")  case object [Exiting](MemberStatus$$Exiting$.html) extends [MemberStatus](MemberStatus.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
30. [**](../../akka/cluster/MemberStatus$$Joining$.html "Permalink")  case object [Joining](MemberStatus$$Joining$.html) extends [MemberStatus](MemberStatus.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
31. [**](../../akka/cluster/MemberStatus$$Leaving$.html "Permalink")  case object [Leaving](MemberStatus$$Leaving$.html) extends [MemberStatus](MemberStatus.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
32. [**](../../akka/cluster/MemberStatus$$PreparingForShutdown$.html "Permalink")  case object [PreparingForShutdown](MemberStatus$$PreparingForShutdown$.html) extends [MemberStatus](MemberStatus.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
33. [**](../../akka/cluster/MemberStatus$$ReadyForShutdown$.html "Permalink")  case object [ReadyForShutdown](MemberStatus$$ReadyForShutdown$.html) extends [MemberStatus](MemberStatus.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
34. [**](../../akka/cluster/MemberStatus$$Removed$.html "Permalink")  case object [Removed](MemberStatus$$Removed$.html) extends [MemberStatus](MemberStatus.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
35. [**](../../akka/cluster/MemberStatus$$Up$.html "Permalink")  case object [Up](MemberStatus$$Up$.html) extends [MemberStatus](MemberStatus.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
36. [**](../../akka/cluster/MemberStatus$$WeaklyUp$.html "Permalink")  case object [WeaklyUp](MemberStatus$$WeaklyUp$.html) extends [MemberStatus](MemberStatus.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
### Deprecated Value Members

1. [**](../../akka/cluster/MemberStatus$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Cluster$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterEvent$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterMessage.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterNodeMBean.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterScope$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterScope.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ConfigValidation.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/DowningProvider.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/GossipEnvelope$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Invalid.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/JoinConfigCompatCheckCluster.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/JoinConfigCompatChecker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/JoinConfigCompatChecker.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Member$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$Down$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$Exiting$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$Joining$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$Leaving$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$PreparingForShutdown$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$ReadyForShutdown$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$Removed$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$Up$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$$WeaklyUp$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/NoDowning.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/UniqueAddress$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/UniqueAddress.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Valid$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/VectorClock.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sbr/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/MemberStatus$.html)*