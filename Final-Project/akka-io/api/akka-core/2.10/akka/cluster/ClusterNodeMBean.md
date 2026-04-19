---
description: Akka 2.10.17 - akka.cluster.ClusterNodeMBean
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:20:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterNodeMBean.html
title: Akka 2.10.17 - akka.cluster.ClusterNodeMBean
---

# Akka 2.10.17 - akka.cluster.ClusterNodeMBean

> **Summary:** Akka 2.10.17 - akka.cluster.ClusterNodeMBean

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
- ClusterNodeMBean
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
t[akka](../index.html).[cluster](index.html)

# ClusterNodeMBean[**](../../akka/cluster/ClusterNodeMBean.html "Permalink")

### 

#### trait ClusterNodeMBean extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Interface for the cluster JMX MBean.

Source[ClusterJmx.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/ClusterJmx.scala#L19)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterNodeMBean
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../akka/cluster/ClusterNodeMBean.html#down(address:String):Unit "Permalink") abstract  def down(address: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send command to DOWN the node specified by 'address'.

Send command to DOWN the node specified by 'address'.
The address format is `akka://actor-system-name@hostname:port`
2. [**](../../akka/cluster/ClusterNodeMBean.html#getClusterStatus:String "Permalink") abstract  def getClusterStatus: String
3. [**](../../akka/cluster/ClusterNodeMBean.html#getLeader:String "Permalink") abstract  def getLeader: StringGet the address of the current leader.

Get the address of the current leader.
The address format is `akka://actor-system-name@hostname:port`
4. [**](../../akka/cluster/ClusterNodeMBean.html#getMemberStatus:String "Permalink") abstract  def getMemberStatus: StringMember status for this node.
5. [**](../../akka/cluster/ClusterNodeMBean.html#getMembers:String "Permalink") abstract  def getMembers: StringComma separated addresses of member nodes, sorted in the cluster ring order.

Comma separated addresses of member nodes, sorted in the cluster ring order.
The address format is `akka://actor-system-name@hostname:port`
6. [**](../../akka/cluster/ClusterNodeMBean.html#getUnreachable:String "Permalink") abstract  def getUnreachable: StringComma separated addresses of unreachable member nodes.

Comma separated addresses of unreachable member nodes.
The address format is `akka://actor-system-name@hostname:port`
7. [**](../../akka/cluster/ClusterNodeMBean.html#isAvailable:Boolean "Permalink") abstract  def isAvailable: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Returns true if the node is not unreachable and not `Down`
and not `Removed`.
8. [**](../../akka/cluster/ClusterNodeMBean.html#isSingleton:Boolean "Permalink") abstract  def isSingleton: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Does the cluster consist of only one member?
9. [**](../../akka/cluster/ClusterNodeMBean.html#join(address:String):Unit "Permalink") abstract  def join(address: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Try to join this cluster node with the node specified by 'address'.

Try to join this cluster node with the node specified by 'address'.
The address format is `akka://actor-system-name@hostname:port`.
A 'Join(thisNodeAddress)' command is sent to the node to join.
10. [**](../../akka/cluster/ClusterNodeMBean.html#leave(address:String):Unit "Permalink") abstract  def leave(address: String): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Send command to issue state transition to LEAVING for the node specified by 'address'.

Send command to issue state transition to LEAVING for the node specified by 'address'.
The address format is `akka://actor-system-name@hostname:port`
### Concrete Value Members

1. [**](../../akka/cluster/ClusterNodeMBean.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/ClusterNodeMBean.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/ClusterNodeMBean.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterNodeMBean toany2stringadd\[ClusterNodeMBean] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/cluster/ClusterNodeMBean.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterNodeMBean, B)ImplicitThis member is added by an implicit conversion from ClusterNodeMBean toArrowAssoc\[ClusterNodeMBean] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/cluster/ClusterNodeMBean.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/cluster/ClusterNodeMBean.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/cluster/ClusterNodeMBean.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/cluster/ClusterNodeMBean.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterNodeMBean) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterNodeMBeanImplicitThis member is added by an implicit conversion from ClusterNodeMBean toEnsuring\[ClusterNodeMBean] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/cluster/ClusterNodeMBean.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterNodeMBean) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterNodeMBeanImplicitThis member is added by an implicit conversion from ClusterNodeMBean toEnsuring\[ClusterNodeMBean] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/cluster/ClusterNodeMBean.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterNodeMBeanImplicitThis member is added by an implicit conversion from ClusterNodeMBean toEnsuring\[ClusterNodeMBean] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/cluster/ClusterNodeMBean.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterNodeMBeanImplicitThis member is added by an implicit conversion from ClusterNodeMBean toEnsuring\[ClusterNodeMBean] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/cluster/ClusterNodeMBean.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/cluster/ClusterNodeMBean.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/cluster/ClusterNodeMBean.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/cluster/ClusterNodeMBean.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/cluster/ClusterNodeMBean.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/cluster/ClusterNodeMBean.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/cluster/ClusterNodeMBean.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/cluster/ClusterNodeMBean.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/cluster/ClusterNodeMBean.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/cluster/ClusterNodeMBean.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/cluster/ClusterNodeMBean.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/cluster/ClusterNodeMBean.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/cluster/ClusterNodeMBean.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/cluster/ClusterNodeMBean.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/cluster/ClusterNodeMBean.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterNodeMBean toStringFormat\[ClusterNodeMBean] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/cluster/ClusterNodeMBean.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterNodeMBean, B)ImplicitThis member is added by an implicit conversion from ClusterNodeMBean toArrowAssoc\[ClusterNodeMBean] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterNodeMBean to any2stringadd\[ClusterNodeMBean]

### Inherited by implicit conversion StringFormat fromClusterNodeMBean to StringFormat\[ClusterNodeMBean]

### Inherited by implicit conversion Ensuring fromClusterNodeMBean to Ensuring\[ClusterNodeMBean]

### Inherited by implicit conversion ArrowAssoc fromClusterNodeMBean to ArrowAssoc\[ClusterNodeMBean]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Cluster.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterEvent$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterNodeMBean.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterScope$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterScope.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ConfigValidation.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/DowningProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/GossipEnvelope$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Invalid.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/JoinConfigCompatCheckCluster.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/JoinConfigCompatChecker$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/JoinConfigCompatChecker.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Member$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/MemberStatus$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/MemberStatus.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/NoDowning.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/UniqueAddress$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/UniqueAddress.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Valid$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/VectorClock.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/metrics/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/pubsub/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sbr/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/singleton/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterNodeMBean.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ClusterNodeMBean.html)*