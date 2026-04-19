---
description: Akka 2.10.17 - akka.cluster.UniqueAddress
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:44:47Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/UniqueAddress$.html
title: Akka 2.10.17 - akka.cluster.UniqueAddress
---

# Akka 2.10.17 - akka.cluster.UniqueAddress

> **Summary:** Akka 2.10.17 - akka.cluster.UniqueAddress

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
[o](UniqueAddress.html "See companion class")[akka](../index.html).[cluster](index.html)

# [UniqueAddress](UniqueAddress.html "See companion class")[**](../../akka/cluster/UniqueAddress$.html "Permalink")

### Companion [class UniqueAddress](UniqueAddress.html "See companion class")

#### object UniqueAddress extends [AbstractFunction2](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction2.html#scala.runtime.AbstractFunction2)\[[Address](../actor/Address.html), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [UniqueAddress](UniqueAddress.html)] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[Member.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/Member.scala#L310)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AbstractFunction2](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction2.html#scala.runtime.AbstractFunction2)\[[Address](../actor/Address.html), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [UniqueAddress](UniqueAddress.html)], ([Address](../actor/Address.html), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [UniqueAddress](UniqueAddress.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UniqueAddress
2. Serializable
3. AbstractFunction2
4. Function2
5. AnyRef
6. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/cluster/UniqueAddress$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/UniqueAddress$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/UniqueAddress$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/cluster/UniqueAddress$.html#apply(address:akka.actor.Address,longUid:Long):akka.cluster.UniqueAddress "Permalink")  def apply(address: [Address](../actor/Address.html), longUid: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [UniqueAddress](UniqueAddress.html)
5. [**](../../akka/cluster/UniqueAddress$.html#apply(remoteUniqueAddress:akka.remote.UniqueAddress):akka.cluster.UniqueAddress "Permalink")  def apply(remoteUniqueAddress: [remote.UniqueAddress](../remote/UniqueAddress.html)): [UniqueAddress](UniqueAddress.html)
6. [**](../../akka/cluster/UniqueAddress$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/cluster/UniqueAddress$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/cluster/UniqueAddress$.html#curried:T1=>(T2=>R) "Permalink")  def curried: ([Address](../actor/Address.html)) \=\> ([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [UniqueAddress](UniqueAddress.html)Definition ClassesFunction2Annotations@unspecialized()
9. [**](../../akka/cluster/UniqueAddress$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../akka/cluster/UniqueAddress$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../akka/cluster/UniqueAddress$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/cluster/UniqueAddress$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/cluster/UniqueAddress$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../akka/cluster/UniqueAddress$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/cluster/UniqueAddress$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/cluster/UniqueAddress$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../akka/cluster/UniqueAddress$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../akka/cluster/UniqueAddress$.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction2 → AnyRef → Any
19. [**](../../akka/cluster/UniqueAddress$.html#tupled:((T1,T2))=>R "Permalink")  def tupled: (([Address](../actor/Address.html), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))) \=\> [UniqueAddress](UniqueAddress.html)Definition ClassesFunction2Annotations@unspecialized()
20. [**](../../akka/cluster/UniqueAddress$.html#unapply(address:akka.cluster.UniqueAddress):Option[(akka.actor.Address,Long)] "Permalink")  def unapply(address: [UniqueAddress](UniqueAddress.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[([Address](../actor/Address.html), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))]
21. [**](../../akka/cluster/UniqueAddress$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/cluster/UniqueAddress$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../akka/cluster/UniqueAddress$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/cluster/UniqueAddress$.html#apply(address:akka.actor.Address,uid:Int):akka.cluster.UniqueAddress "Permalink")  def apply(address: [Address](../actor/Address.html), uid: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [UniqueAddress](UniqueAddress.html)Definition ClassesUniqueAddress → Function2Annotations@deprecated Deprecated*(Since version 2\.4\.11\)* Use Long UID apply instead
2. [**](../../akka/cluster/UniqueAddress$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AbstractFunction2](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction2.html#scala.runtime.AbstractFunction2)\[[Address](../actor/Address.html), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [UniqueAddress](UniqueAddress.html)]

### Inherited from ([Address](../actor/Address.html), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [UniqueAddress](UniqueAddress.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Address.html
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
- https://doc.akka.io/api/akka/current/akka/remote/UniqueAddress.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/UniqueAddress$.html](https://doc.akka.io/api/akka/current/akka/cluster/UniqueAddress$.html)*