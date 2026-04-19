---
description: Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocation
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/external/ExternalShardAllocation.html
title: Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocation
---

# Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocation

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.external.ExternalShardAllocation

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/cluster/index.html "Permalink")  package [cluster](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../index.html)Definition Classes[cluster](../../index.html)
- [**](../../../../akka/cluster/sharding/external/index.html "Permalink")  package [external](index.html)Definition Classes[sharding](../index.html)
- [**](../../../../akka/cluster/sharding/external/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[external](index.html)
- [**](../../../../akka/cluster/sharding/external/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[external](index.html)
- [ClientTimeoutException](ClientTimeoutException.html)
- ExternalShardAllocation
- [ExternalShardAllocationStrategy](ExternalShardAllocationStrategy.html)
- [ShardLocations](ShardLocations.html)
[c](ExternalShardAllocation$.html "See companion object")[akka](../../../index.html).[cluster](../../index.html).[sharding](../index.html).[external](index.html)

# [ExternalShardAllocation](ExternalShardAllocation$.html "See companion object")[**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html "Permalink")

### Companion [object ExternalShardAllocation](ExternalShardAllocation$.html "See companion object")

#### final  class ExternalShardAllocation extends [Extension](../../../actor/Extension.html)

Source[ExternalShardAllocation.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/external/ExternalShardAllocation.scala#L17)Linear Supertypes[Extension](../../../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ExternalShardAllocation
2. Extension
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

1. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#<init>(system:akka.actor.ExtendedActorSystem):akka.cluster.sharding.external.ExternalShardAllocation "Permalink")  new ExternalShardAllocation(system: [ExtendedActorSystem](../../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ExternalShardAllocation toany2stringadd\[ExternalShardAllocation] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ExternalShardAllocation, B)ImplicitThis member is added by an implicit conversion from ExternalShardAllocation toArrowAssoc\[ExternalShardAllocation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#clientFor(typeName:String):akka.cluster.sharding.external.scaladsl.ExternalShardAllocationClient "Permalink")  def clientFor(typeName: String): [ExternalShardAllocationClient](scaladsl/ExternalShardAllocationClient.html)Scala API
8. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ExternalShardAllocation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExternalShardAllocationImplicitThis member is added by an implicit conversion from ExternalShardAllocation toEnsuring\[ExternalShardAllocation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ExternalShardAllocation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExternalShardAllocationImplicitThis member is added by an implicit conversion from ExternalShardAllocation toEnsuring\[ExternalShardAllocation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ExternalShardAllocationImplicitThis member is added by an implicit conversion from ExternalShardAllocation toEnsuring\[ExternalShardAllocation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ExternalShardAllocationImplicitThis member is added by an implicit conversion from ExternalShardAllocation toEnsuring\[ExternalShardAllocation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#getClient(typeName:String):akka.cluster.sharding.external.javadsl.ExternalShardAllocationClient "Permalink")  def getClient(typeName: String): [ExternalShardAllocationClient](javadsl/ExternalShardAllocationClient.html)Java API
17. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ExternalShardAllocation toStringFormat\[ExternalShardAllocation] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/cluster/sharding/external/ExternalShardAllocation.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ExternalShardAllocation, B)ImplicitThis member is added by an implicit conversion from ExternalShardAllocation toArrowAssoc\[ExternalShardAllocation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../../../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromExternalShardAllocation to any2stringadd\[ExternalShardAllocation]

### Inherited by implicit conversion StringFormat fromExternalShardAllocation to StringFormat\[ExternalShardAllocation]

### Inherited by implicit conversion Ensuring fromExternalShardAllocation to Ensuring\[ExternalShardAllocation]

### Inherited by implicit conversion ArrowAssoc fromExternalShardAllocation to ArrowAssoc\[ExternalShardAllocation]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ClientTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocation$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocation.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ShardLocations.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/javadsl/ExternalShardAllocationClient.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/scaladsl/ExternalShardAllocationClient.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocation.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/external/ExternalShardAllocation.html)*