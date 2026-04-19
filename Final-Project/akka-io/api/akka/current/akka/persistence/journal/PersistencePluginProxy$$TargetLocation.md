---
description: Akka 2.10.17 - akka.persistence.journal.PersistencePluginProxy.TargetLocation
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:50:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html
title: Akka 2.10.17 - akka.persistence.journal.PersistencePluginProxy.TargetLocation
---

# Akka 2.10.17 - akka.persistence.journal.PersistencePluginProxy.TargetLocation

> **Summary:** Akka 2.10.17 - akka.persistence.journal.PersistencePluginProxy.TargetLocation

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/persistence/index.html "Permalink")  package [persistence](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/persistence/journal/index.html "Permalink")  package [journal](index.html)Definition Classes[persistence](../index.html)
- [**](../../../akka/persistence/journal/PersistencePluginProxy$.html "Permalink")  object [PersistencePluginProxy](PersistencePluginProxy$.html)Definition Classes[journal](index.html)
- TargetLocation
c[akka](../../index.html).[persistence](../index.html).[journal](index.html).[PersistencePluginProxy](PersistencePluginProxy$.html)

# TargetLocation[**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html "Permalink")

### 

#### final  case class TargetLocation(address: [Address](../../actor/Address.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[PersistencePluginProxy.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence/src/main/scala/akka/persistence/journal/PersistencePluginProxy.scala#L29)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TargetLocation
2. Serializable
3. Product
4. Equals
5. AnyRef
6. Any
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

1. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#<init>(address:akka.actor.Address):akka.persistence.journal.PersistencePluginProxy.TargetLocation "Permalink")  new TargetLocation(address: [Address](../../actor/Address.html))
### Value Members

1. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from TargetLocation toany2stringadd\[TargetLocation] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (TargetLocation, B)ImplicitThis member is added by an implicit conversion from TargetLocation toArrowAssoc\[TargetLocation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#address:akka.actor.Address "Permalink")  val address: [Address](../../actor/Address.html)
7. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (TargetLocation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TargetLocationImplicitThis member is added by an implicit conversion from TargetLocation toEnsuring\[TargetLocation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (TargetLocation) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TargetLocationImplicitThis member is added by an implicit conversion from TargetLocation toEnsuring\[TargetLocation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TargetLocationImplicitThis member is added by an implicit conversion from TargetLocation toEnsuring\[TargetLocation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TargetLocationImplicitThis member is added by an implicit conversion from TargetLocation toEnsuring\[TargetLocation] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from TargetLocation toStringFormat\[TargetLocation] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (TargetLocation, B)ImplicitThis member is added by an implicit conversion from TargetLocation toArrowAssoc\[TargetLocation] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTargetLocation to any2stringadd\[TargetLocation]

### Inherited by implicit conversion StringFormat fromTargetLocation to StringFormat\[TargetLocation]

### Inherited by implicit conversion Ensuring fromTargetLocation to Ensuring\[TargetLocation]

### Inherited by implicit conversion ArrowAssoc fromTargetLocation to ArrowAssoc\[TargetLocation]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Address.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/PersistencePluginProxy$.html
- https://doc.akka.io/api/akka/current/akka/persistence/journal/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html](https://doc.akka.io/api/akka/current/akka/persistence/journal/PersistencePluginProxy$$TargetLocation.html)*