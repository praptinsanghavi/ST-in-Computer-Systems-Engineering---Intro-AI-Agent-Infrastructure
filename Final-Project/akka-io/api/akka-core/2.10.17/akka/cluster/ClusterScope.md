---
description: Akka 2.10.17 - akka.cluster.ClusterScope
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:14:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ClusterScope.html
title: Akka 2.10.17 - akka.cluster.ClusterScope
---

# Akka 2.10.17 - akka.cluster.ClusterScope

> **Summary:** Akka 2.10.17 - akka.cluster.ClusterScope

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
- ClusterScope
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
[c](ClusterScope$.html "See companion object")[akka](../index.html).[cluster](index.html)

# [ClusterScope](ClusterScope$.html "See companion object")[**](../../akka/cluster/ClusterScope.html "Permalink")

### Companion [object ClusterScope](ClusterScope$.html "See companion object")

#### abstract  class ClusterScope extends [Scope](../actor/Scope.html)

Annotations@nowarn() @SerialVersionUID() Source[ClusterActorRefProvider.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/ClusterActorRefProvider.scala#L133)Linear Supertypes[Scope](../actor/Scope.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ClusterScope](ClusterScope$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterScope
2. Scope
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
### Instance Constructors

1. [**](../../akka/cluster/ClusterScope.html#<init>():akka.cluster.ClusterScope "Permalink")  new ClusterScope()
### Abstract Value Members

1. [**](../../akka/cluster/ClusterScope.html#withFallback(other:akka.actor.Scope):akka.actor.Scope "Permalink") abstract  def withFallback(other: [Scope](../actor/Scope.html)): [Scope](../actor/Scope.html)When merging [akka.actor.Deploy](../actor/Deploy.html) instances using `withFallback()` on
the left one, this is propagated to “merging” scopes in the same way.

When merging [akka.actor.Deploy](../actor/Deploy.html) instances using `withFallback()` on
the left one, this is propagated to “merging” scopes in the same way.
The setup is biased towards preferring the callee over the argument, i.e.
`a.withFallback(b)` is called expecting that `a` should in general take
precedence.

Definition Classes[Scope](../actor/Scope.html)
### Concrete Value Members

1. [**](../../akka/cluster/ClusterScope.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/cluster/ClusterScope.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/cluster/ClusterScope.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterScope toany2stringadd\[ClusterScope] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/cluster/ClusterScope.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterScope, B)ImplicitThis member is added by an implicit conversion from ClusterScope toArrowAssoc\[ClusterScope] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/cluster/ClusterScope.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/cluster/ClusterScope.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/cluster/ClusterScope.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/cluster/ClusterScope.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterScope) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterScopeImplicitThis member is added by an implicit conversion from ClusterScope toEnsuring\[ClusterScope] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/cluster/ClusterScope.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterScope) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterScopeImplicitThis member is added by an implicit conversion from ClusterScope toEnsuring\[ClusterScope] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/cluster/ClusterScope.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterScopeImplicitThis member is added by an implicit conversion from ClusterScope toEnsuring\[ClusterScope] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/cluster/ClusterScope.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterScopeImplicitThis member is added by an implicit conversion from ClusterScope toEnsuring\[ClusterScope] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/cluster/ClusterScope.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/cluster/ClusterScope.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/cluster/ClusterScope.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/cluster/ClusterScope.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/cluster/ClusterScope.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/cluster/ClusterScope.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/cluster/ClusterScope.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/cluster/ClusterScope.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/cluster/ClusterScope.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/cluster/ClusterScope.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/cluster/ClusterScope.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/cluster/ClusterScope.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/cluster/ClusterScope.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/cluster/ClusterScope.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/cluster/ClusterScope.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterScope toStringFormat\[ClusterScope] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/cluster/ClusterScope.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterScope, B)ImplicitThis member is added by an implicit conversion from ClusterScope toArrowAssoc\[ClusterScope] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Scope](../actor/Scope.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterScope to any2stringadd\[ClusterScope]

### Inherited by implicit conversion StringFormat fromClusterScope to StringFormat\[ClusterScope]

### Inherited by implicit conversion Ensuring fromClusterScope to Ensuring\[ClusterScope]

### Inherited by implicit conversion ArrowAssoc fromClusterScope to ArrowAssoc\[ClusterScope]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Deploy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Scope.html
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
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterScope.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterScope.html)*