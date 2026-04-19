---
description: Akka 2.10.17 - akka.cluster.Member
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:14:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/Member.html
title: Akka 2.10.17 - akka.cluster.Member
---

# Akka 2.10.17 - akka.cluster.Member

> **Summary:** Akka 2.10.17 - akka.cluster.Member

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
- Member
- [MemberStatus](MemberStatus.html "Defines the current status of a cluster member node")
- [NoDowning](NoDowning.html "Default downing provider used when no provider is configured.")
- [UniqueAddress](UniqueAddress.html "Member identifier consisting of address and random uid.")
- [Valid](Valid$.html)
- [VectorClock](VectorClock.html "Representation of a Vector-based clock (counting clock), inspired by Lamport logical clocks.")
[c](Member$.html "See companion object")[akka](../index.html).[cluster](index.html)

# [Member](Member$.html "See companion object")[**](../../akka/cluster/Member.html "Permalink")

### Companion [object Member](Member$.html "See companion object")

#### class Member extends Serializable

Represents the address, current status, and roles of a cluster member node.

Note: `hashCode` and `equals` are solely based on the underlying `Address`, not its `MemberStatus`
and roles.

Annotations@SerialVersionUID() @nowarn() Source[Member.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/Member.scala#L25)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Member
2. Serializable
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
### Value Members

1. [**](../../akka/cluster/Member.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/Member.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/Member.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Member toany2stringadd\[Member] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/cluster/Member.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Member, B)ImplicitThis member is added by an implicit conversion from Member toArrowAssoc\[Member] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/cluster/Member.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/cluster/Member.html#address:akka.actor.Address "Permalink")  def address: [Address](../actor/Address.html)
7. [**](../../akka/cluster/Member.html#appVersion:akka.util.Version "Permalink")  val appVersion: [util.Version](../util/Version.html)
8. [**](../../akka/cluster/Member.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
9. [**](../../akka/cluster/Member.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/cluster/Member.html#copy(status:akka.cluster.MemberStatus):akka.cluster.Member "Permalink")  def copy(status: [MemberStatus](MemberStatus.html)): Member
11. [**](../../akka/cluster/Member.html#copyUp(upNumber:Int):akka.cluster.Member "Permalink")  def copyUp(upNumber: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Member
12. [**](../../akka/cluster/Member.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Member) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MemberImplicitThis member is added by an implicit conversion from Member toEnsuring\[Member] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../akka/cluster/Member.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Member) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MemberImplicitThis member is added by an implicit conversion from Member toEnsuring\[Member] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../akka/cluster/Member.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): MemberImplicitThis member is added by an implicit conversion from Member toEnsuring\[Member] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../akka/cluster/Member.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): MemberImplicitThis member is added by an implicit conversion from Member toEnsuring\[Member] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../akka/cluster/Member.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/cluster/Member.html#equals(other:Any):Boolean "Permalink")  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesMember → AnyRef → Any
18. [**](../../akka/cluster/Member.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/cluster/Member.html#getRoles:java.util.Set[String] "Permalink")  def getRoles: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]Java API
20. [**](../../akka/cluster/Member.html#hasRole(role:String):Boolean "Permalink")  def hasRole(role: String): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)
21. [**](../../akka/cluster/Member.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesMember → AnyRef → Any
22. [**](../../akka/cluster/Member.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../akka/cluster/Member.html#isOlderThan(other:akka.cluster.Member):Boolean "Permalink")  def isOlderThan(other: Member): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Is this member older, has been part of cluster longer, than another
member.

Is this member older, has been part of cluster longer, than another
member. It is only correct when comparing two existing members in a
cluster. A member that joined after removal of another member may be
considered older than the removed member.

Note that it only makes sense to compare with other members of
same data center (upNumber has a higher risk of being reused across data centers).
To avoid mistakes of comparing members of different data centers this
method will throw `IllegalArgumentException` if the members belong
to different data centers.

Annotations@throws("if members from different data centers")
24. [**](../../akka/cluster/Member.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../akka/cluster/Member.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../akka/cluster/Member.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../akka/cluster/Member.html#roles:Set[String] "Permalink")  val roles: Set\[String]
28. [**](../../akka/cluster/Member.html#status:akka.cluster.MemberStatus "Permalink")  val status: [MemberStatus](MemberStatus.html)
29. [**](../../akka/cluster/Member.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../akka/cluster/Member.html#toString():String "Permalink")  def toString(): StringDefinition ClassesMember → AnyRef → Any
31. [**](../../akka/cluster/Member.html#uniqueAddress:akka.cluster.UniqueAddress "Permalink")  val uniqueAddress: [UniqueAddress](UniqueAddress.html)
32. [**](../../akka/cluster/Member.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../akka/cluster/Member.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../akka/cluster/Member.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/cluster/Member.html#dataCenter:akka.cluster.ClusterSettings.DataCenter "Permalink")  lazy val dataCenter: [DataCenter](ClusterSettings$.html#DataCenter=String)Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
2. [**](../../akka/cluster/Member.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../akka/cluster/Member.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Member toStringFormat\[Member] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
4. [**](../../akka/cluster/Member.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Member, B)ImplicitThis member is added by an implicit conversion from Member toArrowAssoc\[Member] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromMember to any2stringadd\[Member]

### Inherited by implicit conversion StringFormat fromMember to StringFormat\[Member]

### Inherited by implicit conversion Ensuring fromMember to Ensuring\[Member]

### Inherited by implicit conversion ArrowAssoc fromMember to ArrowAssoc\[Member]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Address.html
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
- https://doc.akka.io/api/akka-core/2.10.17/akka/util/Version.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Member.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Member.html)*