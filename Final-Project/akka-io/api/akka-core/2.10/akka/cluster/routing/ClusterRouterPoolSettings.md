---
description: Akka 2.10.17 - akka.cluster.routing.ClusterRouterPoolSettings
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:26:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/routing/ClusterRouterPoolSettings.html
title: Akka 2.10.17 - akka.cluster.routing.ClusterRouterPoolSettings
---

# Akka 2.10.17 - akka.cluster.routing.ClusterRouterPoolSettings

> **Summary:** Akka 2.10.17 - akka.cluster.routing.ClusterRouterPoolSettings

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/routing/index.html "Permalink")  package [routing](index.html)Definition Classes[cluster](../index.html)
- [ClusterRouterGroup](ClusterRouterGroup.html "akka.routing.RouterConfig implementation for deployment on cluster nodes.")
- [ClusterRouterGroupSettings](ClusterRouterGroupSettings.html "totalInstances of cluster router must be > 0")
- [ClusterRouterPool](ClusterRouterPool.html "akka.routing.RouterConfig implementation for deployment on cluster nodes.")
- ClusterRouterPoolSettings
[c](ClusterRouterPoolSettings$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[routing](index.html)

# [ClusterRouterPoolSettings](ClusterRouterPoolSettings$.html "See companion object")[**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html "Permalink")

### Companion [object ClusterRouterPoolSettings](ClusterRouterPoolSettings$.html "See companion object")

#### final  class ClusterRouterPoolSettings extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable with ClusterRouterSettingsBase

`totalInstances` of cluster router must be \> 0
`maxInstancesPerNode` of cluster router must be \> 0
`maxInstancesPerNode` of cluster router must be 1 when routeesPath is defined

Annotations@SerialVersionUID() Source[ClusterRouterConfig.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/routing/ClusterRouterConfig.scala#L180)Linear SupertypesClusterRouterSettingsBase, [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterRouterPoolSettings
2. ClusterRouterSettingsBase
3. Serializable
4. Product
5. Equals
6. AnyRef
7. Any
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

1. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#<init>(totalInstances:Int,maxInstancesPerNode:Int,allowLocalRoutees:Boolean,useRoles:java.util.Set[String]):akka.cluster.routing.ClusterRouterPoolSettings "Permalink")  new ClusterRouterPoolSettings(totalInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxInstancesPerNode: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), allowLocalRoutees: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), useRoles: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String])Java API
2. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#<init>(totalInstances:Int,maxInstancesPerNode:Int,allowLocalRoutees:Boolean,useRoles:Set[String]):akka.cluster.routing.ClusterRouterPoolSettings "Permalink")  new ClusterRouterPoolSettings(totalInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), maxInstancesPerNode: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), allowLocalRoutees: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), useRoles: Set\[String])
### Value Members

1. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterRouterPoolSettings toany2stringadd\[ClusterRouterPoolSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterRouterPoolSettings, B)ImplicitThis member is added by an implicit conversion from ClusterRouterPoolSettings toArrowAssoc\[ClusterRouterPoolSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#allowLocalRoutees:Boolean "Permalink")  val allowLocalRoutees: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesClusterRouterPoolSettings → ClusterRouterSettingsBase
7. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#canEqual(that:Any):Boolean "Permalink")  def canEqual(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesClusterRouterPoolSettings → Equals
9. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterRouterPoolSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterRouterPoolSettingsImplicitThis member is added by an implicit conversion from ClusterRouterPoolSettings toEnsuring\[ClusterRouterPoolSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterRouterPoolSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterRouterPoolSettingsImplicitThis member is added by an implicit conversion from ClusterRouterPoolSettings toEnsuring\[ClusterRouterPoolSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterRouterPoolSettingsImplicitThis member is added by an implicit conversion from ClusterRouterPoolSettings toEnsuring\[ClusterRouterPoolSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterRouterPoolSettingsImplicitThis member is added by an implicit conversion from ClusterRouterPoolSettings toEnsuring\[ClusterRouterPoolSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesClusterRouterPoolSettings → Equals → AnyRef → Any
16. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesClusterRouterPoolSettings → AnyRef → Any
18. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#maxInstancesPerNode:Int "Permalink")  val maxInstancesPerNode: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)
20. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
21. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#productArity:Int "Permalink")  def productArity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesClusterRouterPoolSettings → Product
24. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#productElement(n:Int):Any "Permalink")  def productElement(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesClusterRouterPoolSettings → Product
25. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
26. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
27. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#productIterator:Iterator[Any] "Permalink")  def productIterator: Iterator\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesProduct
28. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#productPrefix:String "Permalink")  def productPrefix: StringDefinition ClassesProduct
29. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#toString():String "Permalink")  def toString(): StringDefinition ClassesClusterRouterPoolSettings → AnyRef → Any
31. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#totalInstances:Int "Permalink")  val totalInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesClusterRouterPoolSettings → ClusterRouterSettingsBase
32. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#useRoles:Set[String] "Permalink")  val useRoles: Set\[String]Definition ClassesClusterRouterPoolSettings → ClusterRouterSettingsBase
33. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#withUseRoles(useRoles:java.util.Set[String]):akka.cluster.routing.ClusterRouterPoolSettings "Permalink")  def withUseRoles(useRoles: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]): ClusterRouterPoolSettingsJava API
37. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#withUseRoles(useRoles:String*):akka.cluster.routing.ClusterRouterPoolSettings "Permalink")  def withUseRoles(useRoles: String\*): ClusterRouterPoolSettingsAnnotations@varargs()
38. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#withUseRoles(useRoles:Set[String]):akka.cluster.routing.ClusterRouterPoolSettings "Permalink")  def withUseRoles(useRoles: Set\[String]): ClusterRouterPoolSettings
### Deprecated Value Members

1. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterRouterPoolSettings toStringFormat\[ClusterRouterPoolSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/routing/ClusterRouterPoolSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterRouterPoolSettings, B)ImplicitThis member is added by an implicit conversion from ClusterRouterPoolSettings toArrowAssoc\[ClusterRouterPoolSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from ClusterRouterSettingsBase

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterRouterPoolSettings to any2stringadd\[ClusterRouterPoolSettings]

### Inherited by implicit conversion StringFormat fromClusterRouterPoolSettings to StringFormat\[ClusterRouterPoolSettings]

### Inherited by implicit conversion Ensuring fromClusterRouterPoolSettings to Ensuring\[ClusterRouterPoolSettings]

### Inherited by implicit conversion ArrowAssoc fromClusterRouterPoolSettings to ArrowAssoc\[ClusterRouterPoolSettings]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterGroup.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterGroupSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterGroupSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterPoolSettings$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterPoolSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterPoolSettings.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/routing/ClusterRouterPoolSettings.html)*