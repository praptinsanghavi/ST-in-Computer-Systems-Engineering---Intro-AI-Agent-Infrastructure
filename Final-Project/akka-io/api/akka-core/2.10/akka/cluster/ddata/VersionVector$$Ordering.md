---
description: Akka 2.10.17 - akka.cluster.ddata.VersionVector.Ordering
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:41:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/ddata/VersionVector$$Ordering.html
title: Akka 2.10.17 - akka.cluster.ddata.VersionVector.Ordering
---

# Akka 2.10.17 - akka.cluster.ddata.VersionVector.Ordering

> **Summary:** Akka 2.10.17 - akka.cluster.ddata.VersionVector.Ordering

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/ddata/index.html "Permalink")  package [ddata](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/ddata/VersionVector$.html "Permalink")  object [VersionVector](VersionVector$.html "VersionVector module with helper classes and methods.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)VersionVector module with helper classes and methods.

VersionVector module with helper classes and methods.

Definition Classes[ddata](index.html)
- [After](VersionVector$$After$.html)
- [Before](VersionVector$$Before$.html)
- [Concurrent](VersionVector$$Concurrent$.html)
- Ordering
- [Same](VersionVector$$Same$.html)
t[akka](../../index.html).[cluster](../index.html).[ddata](index.html).[VersionVector](VersionVector$.html)

# Ordering[**](../../../akka/cluster/ddata/VersionVector$$Ordering.html "Permalink")

### 

#### sealed  trait Ordering extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[VersionVector.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-distributed-data/src/main/scala/akka/cluster/ddata/VersionVector.scala#L43)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[After](VersionVector$$After$.html), [Before](VersionVector$$Before$.html), [Concurrent](VersionVector$$Concurrent$.html), [Same](VersionVector$$Same$.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Ordering
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
### Value Members

1. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Ordering toany2stringadd\[Ordering] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Ordering, B)ImplicitThis member is added by an implicit conversion from Ordering toArrowAssoc\[Ordering] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Ordering) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OrderingImplicitThis member is added by an implicit conversion from Ordering toEnsuring\[Ordering] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Ordering) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): OrderingImplicitThis member is added by an implicit conversion from Ordering toEnsuring\[Ordering] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): OrderingImplicitThis member is added by an implicit conversion from Ordering toEnsuring\[Ordering] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): OrderingImplicitThis member is added by an implicit conversion from Ordering toEnsuring\[Ordering] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Ordering toStringFormat\[Ordering] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/ddata/VersionVector$$Ordering.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Ordering, B)ImplicitThis member is added by an implicit conversion from Ordering toArrowAssoc\[Ordering] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromOrdering to any2stringadd\[Ordering]

### Inherited by implicit conversion StringFormat fromOrdering to StringFormat\[Ordering]

### Inherited by implicit conversion Ensuring fromOrdering to Ensuring\[Ordering]

### Inherited by implicit conversion ArrowAssoc fromOrdering to ArrowAssoc\[Ordering]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/VersionVector$$After$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/VersionVector$$Before$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/VersionVector$$Concurrent$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/VersionVector$$Ordering.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/VersionVector$$Same$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/VersionVector$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/VersionVector$$Ordering.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/ddata/VersionVector$$Ordering.html)*