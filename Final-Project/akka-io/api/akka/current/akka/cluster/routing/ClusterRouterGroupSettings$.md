---
description: Akka 2.10.17 - akka.cluster.routing.ClusterRouterGroupSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:02:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/routing/ClusterRouterGroupSettings$.html
title: Akka 2.10.17 - akka.cluster.routing.ClusterRouterGroupSettings
---

# Akka 2.10.17 - akka.cluster.routing.ClusterRouterGroupSettings

> **Summary:** Akka 2.10.17 - akka.cluster.routing.ClusterRouterGroupSettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/routing/index.html "Permalink")  package [routing](index.html)Definition Classes[cluster](../index.html)
- [ClusterRouterGroup](ClusterRouterGroup.html "akka.routing.RouterConfig implementation for deployment on cluster nodes.")
- [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "totalInstances of cluster router must be > 0")
- [ClusterRouterPool](ClusterRouterPool.html "akka.routing.RouterConfig implementation for deployment on cluster nodes.")
- [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "totalInstances of cluster router must be > 0 maxInstancesPerNode of cluster router must be > 0 maxInstancesPerNode of cluster router must be 1 when routeesPath is defined")
[o](ClusterRouterGroupSettings.html "See companion class")[akka](../../index.html).[cluster](../index.html).[routing](index.html)

# [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "See companion class")[**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html "Permalink")

### Companion [class ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "See companion class")

#### object ClusterRouterGroupSettings extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[ClusterRouterConfig.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/routing/ClusterRouterConfig.scala#L36)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterRouterGroupSettings
2. Serializable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#apply(totalInstances:Int,routeesPaths:Seq[String],allowLocalRoutees:Boolean,useRoles:Set[String]):akka.cluster.routing.ClusterRouterGroupSettings "Permalink")  def apply(totalInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), routeesPaths: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String], allowLocalRoutees: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), useRoles: Set\[String]): [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html)
5. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#apply(totalInstances:Int,routeesPaths:Seq[String],allowLocalRoutees:Boolean,useRoles:String*):akka.cluster.routing.ClusterRouterGroupSettings "Permalink")  def apply(totalInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), routeesPaths: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String], allowLocalRoutees: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), useRoles: String\*): [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html)Annotations@varargs()
6. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#fromConfig(config:com.typesafe.config.Config):akka.cluster.routing.ClusterRouterGroupSettings "Permalink")  def fromConfig(config: Config): [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html)
11. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#unapply(settings:akka.cluster.routing.ClusterRouterGroupSettings):Option[(Int,Seq[String],Boolean,Set[String])] "Permalink")  def unapply(settings: [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[([Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String], [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), Set\[String])]
20. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroup.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroupSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroupSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterPool.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterPoolSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterPoolSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroupSettings$.html](https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroupSettings$.html)*