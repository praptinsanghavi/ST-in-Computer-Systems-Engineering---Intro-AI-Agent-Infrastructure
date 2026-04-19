---
description: Akka 2.10.17 - akka.cluster.routing.ClusterRouterGroupSettings
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:02:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/routing/ClusterRouterGroupSettings.html
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
- ClusterRouterGroupSettings
- [ClusterRouterPool](ClusterRouterPool.html "akka.routing.RouterConfig implementation for deployment on cluster nodes.")
- [ClusterRouterPoolSettings](ClusterRouterPoolSettings.html "totalInstances of cluster router must be > 0 maxInstancesPerNode of cluster router must be > 0 maxInstancesPerNode of cluster router must be 1 when routeesPath is defined")
[c](ClusterRouterGroupSettings$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[routing](index.html)

# [ClusterRouterGroupSettings](ClusterRouterGroupSettings$.html "See companion object")[**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html "Permalink")

### Companion [object ClusterRouterGroupSettings](ClusterRouterGroupSettings$.html "See companion object")

#### final  class ClusterRouterGroupSettings extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable with ClusterRouterSettingsBase

`totalInstances` of cluster router must be \> 0

Annotations@SerialVersionUID() Source[ClusterRouterConfig.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster/src/main/scala/akka/cluster/routing/ClusterRouterConfig.scala#L70)Linear SupertypesClusterRouterSettingsBase, [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterRouterGroupSettings
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

1. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#<init>(totalInstances:Int,routeesPaths:Iterable[String],allowLocalRoutees:Boolean,useRoles:java.util.Set[String]):akka.cluster.routing.ClusterRouterGroupSettings "Permalink")  new ClusterRouterGroupSettings(totalInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), routeesPaths: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[String], allowLocalRoutees: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), useRoles: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String])Java API
2. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#<init>(totalInstances:Int,routeesPaths:Seq[String],allowLocalRoutees:Boolean,useRoles:Set[String]):akka.cluster.routing.ClusterRouterGroupSettings "Permalink")  new ClusterRouterGroupSettings(totalInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), routeesPaths: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String], allowLocalRoutees: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), useRoles: Set\[String])
### Value Members

1. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterRouterGroupSettings toany2stringadd\[ClusterRouterGroupSettings] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterRouterGroupSettings, B)ImplicitThis member is added by an implicit conversion from ClusterRouterGroupSettings toArrowAssoc\[ClusterRouterGroupSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#allowLocalRoutees:Boolean "Permalink")  val allowLocalRoutees: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesClusterRouterGroupSettings → ClusterRouterSettingsBase
7. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#canEqual(that:Any):Boolean "Permalink")  def canEqual(that: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesClusterRouterGroupSettings → Equals
9. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterRouterGroupSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterRouterGroupSettingsImplicitThis member is added by an implicit conversion from ClusterRouterGroupSettings toEnsuring\[ClusterRouterGroupSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterRouterGroupSettings) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterRouterGroupSettingsImplicitThis member is added by an implicit conversion from ClusterRouterGroupSettings toEnsuring\[ClusterRouterGroupSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterRouterGroupSettingsImplicitThis member is added by an implicit conversion from ClusterRouterGroupSettings toEnsuring\[ClusterRouterGroupSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterRouterGroupSettingsImplicitThis member is added by an implicit conversion from ClusterRouterGroupSettings toEnsuring\[ClusterRouterGroupSettings] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#equals(obj:Any):Boolean "Permalink")  def equals(obj: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesClusterRouterGroupSettings → Equals → AnyRef → Any
16. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesClusterRouterGroupSettings → AnyRef → Any
18. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#productArity:Int "Permalink")  def productArity: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesClusterRouterGroupSettings → Product
23. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#productElement(n:Int):Any "Permalink")  def productElement(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Definition ClassesClusterRouterGroupSettings → Product
24. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
25. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
26. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#productIterator:Iterator[Any] "Permalink")  def productIterator: Iterator\[[Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)]Definition ClassesProduct
27. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#productPrefix:String "Permalink")  def productPrefix: StringDefinition ClassesProduct
28. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#routeesPaths:Seq[String] "Permalink")  val routeesPaths: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[String]
29. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#toString():String "Permalink")  def toString(): StringDefinition ClassesClusterRouterGroupSettings → AnyRef → Any
31. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#totalInstances:Int "Permalink")  val totalInstances: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesClusterRouterGroupSettings → ClusterRouterSettingsBase
32. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#useRoles:Set[String] "Permalink")  val useRoles: Set\[String]Definition ClassesClusterRouterGroupSettings → ClusterRouterSettingsBase
33. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#withUseRoles(useRoles:java.util.Set[String]):akka.cluster.routing.ClusterRouterGroupSettings "Permalink")  def withUseRoles(useRoles: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]): ClusterRouterGroupSettingsJava API
37. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#withUseRoles(useRoles:String*):akka.cluster.routing.ClusterRouterGroupSettings "Permalink")  def withUseRoles(useRoles: String\*): ClusterRouterGroupSettingsAnnotations@varargs()
38. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#withUseRoles(useRoles:Set[String]):akka.cluster.routing.ClusterRouterGroupSettings "Permalink")  def withUseRoles(useRoles: Set\[String]): ClusterRouterGroupSettings
### Deprecated Value Members

1. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterRouterGroupSettings toStringFormat\[ClusterRouterGroupSettings] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/routing/ClusterRouterGroupSettings.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterRouterGroupSettings, B)ImplicitThis member is added by an implicit conversion from ClusterRouterGroupSettings toArrowAssoc\[ClusterRouterGroupSettings] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from ClusterRouterSettingsBase

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterRouterGroupSettings to any2stringadd\[ClusterRouterGroupSettings]

### Inherited by implicit conversion StringFormat fromClusterRouterGroupSettings to StringFormat\[ClusterRouterGroupSettings]

### Inherited by implicit conversion Ensuring fromClusterRouterGroupSettings to Ensuring\[ClusterRouterGroupSettings]

### Inherited by implicit conversion ArrowAssoc fromClusterRouterGroupSettings to ArrowAssoc\[ClusterRouterGroupSettings]

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
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroupSettings.html](https://doc.akka.io/api/akka/current/akka/cluster/routing/ClusterRouterGroupSettings.html)*