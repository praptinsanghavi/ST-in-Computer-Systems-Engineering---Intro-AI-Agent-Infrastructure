---
description: Akka 2.10.17 - akka.cluster.ddata.Key.UnspecificKey
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:41:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/Key$$UnspecificKey.html
title: Akka 2.10.17 - akka.cluster.ddata.Key.UnspecificKey
---

# Akka 2.10.17 - akka.cluster.ddata.Key.UnspecificKey

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.Key.UnspecificKey

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/ddata/Key$.html "Permalink")  object [Key](Key$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[ddata](index.html)
- UnspecificKey
c[akka](../../index.html).[cluster](../index.html).[ddata](index.html).[Key](Key$.html)

# UnspecificKey[**](../../../akka/cluster/ddata/Key$$UnspecificKey.html "Permalink")

### 

#### final  case class UnspecificKey(\_id: [KeyId](Key$.html#KeyId=String)) extends [Key](Key.html)\[[ReplicatedData](ReplicatedData.html)] with [ReplicatedDataSerialization](ReplicatedDataSerialization.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[Key.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/Key.scala#L20)Linear Supertypes[Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [ReplicatedDataSerialization](ReplicatedDataSerialization.html), [Key](Key.html)\[[ReplicatedData](ReplicatedData.html)], [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. UnspecificKey
2. Product
3. Equals
4. ReplicatedDataSerialization
5. Key
6. Serializable
7. AnyRef
8. Any
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

1. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#<init>(_id:akka.cluster.ddata.Key.KeyId):akka.cluster.ddata.Key.UnspecificKey "Permalink")  new UnspecificKey(\_id: [KeyId](Key$.html#KeyId=String))
### Value Members

1. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from UnspecificKey toany2stringadd\[UnspecificKey] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (UnspecificKey, B)ImplicitThis member is added by an implicit conversion from UnspecificKey toArrowAssoc\[UnspecificKey] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#_id:akka.cluster.ddata.Key.KeyId "Permalink")  val \_id: [KeyId](Key$.html#KeyId=String)
7. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (UnspecificKey) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnspecificKeyImplicitThis member is added by an implicit conversion from UnspecificKey toEnsuring\[UnspecificKey] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (UnspecificKey) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnspecificKeyImplicitThis member is added by an implicit conversion from UnspecificKey toEnsuring\[UnspecificKey] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): UnspecificKeyImplicitThis member is added by an implicit conversion from UnspecificKey toEnsuring\[UnspecificKey] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): UnspecificKeyImplicitThis member is added by an implicit conversion from UnspecificKey toEnsuring\[UnspecificKey] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#equals(o:Any):Boolean "Permalink") final  def equals(o: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[Key](Key.html) → AnyRef → Any
15. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[Key](Key.html) → AnyRef → Any
17. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#id:akka.cluster.ddata.Key.KeyId "Permalink")  val id: [KeyId](Key$.html#KeyId=String)Definition Classes[Key](Key.html)
18. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
23. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
24. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#toString():String "Permalink")  def toString(): StringDefinition Classes[Key](Key.html) → AnyRef → Any
25. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#withId(newId:akka.cluster.ddata.Key.KeyId):akka.cluster.ddata.Key[akka.cluster.ddata.ReplicatedData] "Permalink")  def withId(newId: [KeyId](Key$.html#KeyId=String)): [Key](Key.html)\[[ReplicatedData](ReplicatedData.html)]Definition Classes[Key](Key.html)
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from UnspecificKey toStringFormat\[UnspecificKey] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/Key$$UnspecificKey.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (UnspecificKey, B)ImplicitThis member is added by an implicit conversion from UnspecificKey toArrowAssoc\[UnspecificKey] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [ReplicatedDataSerialization](ReplicatedDataSerialization.html)

### Inherited from [Key](Key.html)\[[ReplicatedData](ReplicatedData.html)]

### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromUnspecificKey to any2stringadd\[UnspecificKey]

### Inherited by implicit conversion StringFormat fromUnspecificKey to StringFormat\[UnspecificKey]

### Inherited by implicit conversion Ensuring fromUnspecificKey to Ensuring\[UnspecificKey]

### Inherited by implicit conversion ArrowAssoc fromUnspecificKey to ArrowAssoc\[UnspecificKey]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key$$UnspecificKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ReplicatedData.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/ReplicatedDataSerialization.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key$$UnspecificKey.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/Key$$UnspecificKey.html)*