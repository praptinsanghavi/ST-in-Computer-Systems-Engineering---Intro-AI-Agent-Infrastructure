---
description: Akka 2.10.17 - akka.japi.tuple.Tuple5
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:16:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/japi/tuple/Tuple5.html
title: Akka 2.10.17 - akka.japi.tuple.Tuple5
---

# Akka 2.10.17 - akka.japi.tuple.Tuple5

> **Summary:** Akka 2.10.17 - akka.japi.tuple.Tuple5

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/japi/index.html "Permalink")  package [japi](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/japi/tuple/index.html "Permalink")  package [tuple](index.html)Definition Classes[japi](../index.html)
- [Tuple10](Tuple10.html "Java API Tuple container.")
- [Tuple11](Tuple11.html "Java API Tuple container.")
- [Tuple12](Tuple12.html "Java API Tuple container.")
- [Tuple13](Tuple13.html "Java API Tuple container.")
- [Tuple14](Tuple14.html "Java API Tuple container.")
- [Tuple15](Tuple15.html "Java API Tuple container.")
- [Tuple16](Tuple16.html "Java API Tuple container.")
- [Tuple17](Tuple17.html "Java API Tuple container.")
- [Tuple18](Tuple18.html "Java API Tuple container.")
- [Tuple19](Tuple19.html "Java API Tuple container.")
- [Tuple20](Tuple20.html "Java API Tuple container.")
- [Tuple21](Tuple21.html "Java API Tuple container.")
- [Tuple22](Tuple22.html "Java API Tuple container.")
- [Tuple3](Tuple3.html "Java API Tuple container.")
- [Tuple4](Tuple4.html "Java API Tuple container.")
- Tuple5
- [Tuple6](Tuple6.html "Java API Tuple container.")
- [Tuple7](Tuple7.html "Java API Tuple container.")
- [Tuple8](Tuple8.html "Java API Tuple container.")
- [Tuple9](Tuple9.html "Java API Tuple container.")
[c](Tuple5$.html "See companion object")[akka](../../index.html).[japi](../index.html).[tuple](index.html)

# [Tuple5](Tuple5$.html "See companion object")[**](../../../akka/japi/tuple/Tuple5.html "Permalink")

### Companion [object Tuple5](Tuple5$.html "See companion object")

#### final  case class Tuple5\[T1, T2, T3, T4, T5](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Java API Tuple container.

Annotations@SerialVersionUID() Source[Tuples.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/target/scala-2.13/src_managed/main/akka/japi/tuple/Tuples.scala#L49)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Tuple5
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

1. [**](../../../akka/japi/tuple/Tuple5.html#<init>(t1:T1,t2:T2,t3:T3,t4:T4,t5:T5):akka.japi.tuple.Tuple5[T1,T2,T3,T4,T5] "Permalink")  new Tuple5(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5)
### Value Members

1. [**](../../../akka/japi/tuple/Tuple5.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/japi/tuple/Tuple5.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/japi/tuple/Tuple5.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Tuple5\[T1, T2, T3, T4, T5] toany2stringadd\[Tuple5\[T1, T2, T3, T4, T5]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/japi/tuple/Tuple5.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Tuple5\[T1, T2, T3, T4, T5], B)ImplicitThis member is added by an implicit conversion from Tuple5\[T1, T2, T3, T4, T5] toArrowAssoc\[Tuple5\[T1, T2, T3, T4, T5]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/japi/tuple/Tuple5.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/japi/tuple/Tuple5.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/japi/tuple/Tuple5.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/japi/tuple/Tuple5.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Tuple5\[T1, T2, T3, T4, T5]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Tuple5\[T1, T2, T3, T4, T5]ImplicitThis member is added by an implicit conversion from Tuple5\[T1, T2, T3, T4, T5] toEnsuring\[Tuple5\[T1, T2, T3, T4, T5]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/japi/tuple/Tuple5.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Tuple5\[T1, T2, T3, T4, T5]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Tuple5\[T1, T2, T3, T4, T5]ImplicitThis member is added by an implicit conversion from Tuple5\[T1, T2, T3, T4, T5] toEnsuring\[Tuple5\[T1, T2, T3, T4, T5]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/japi/tuple/Tuple5.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Tuple5\[T1, T2, T3, T4, T5]ImplicitThis member is added by an implicit conversion from Tuple5\[T1, T2, T3, T4, T5] toEnsuring\[Tuple5\[T1, T2, T3, T4, T5]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/japi/tuple/Tuple5.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Tuple5\[T1, T2, T3, T4, T5]ImplicitThis member is added by an implicit conversion from Tuple5\[T1, T2, T3, T4, T5] toEnsuring\[Tuple5\[T1, T2, T3, T4, T5]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/japi/tuple/Tuple5.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/japi/tuple/Tuple5.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/japi/tuple/Tuple5.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../akka/japi/tuple/Tuple5.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/japi/tuple/Tuple5.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/japi/tuple/Tuple5.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/japi/tuple/Tuple5.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
19. [**](../../../akka/japi/tuple/Tuple5.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../akka/japi/tuple/Tuple5.html#t1:T1 "Permalink")  val t1: T1
21. [**](../../../akka/japi/tuple/Tuple5.html#t2:T2 "Permalink")  val t2: T2
22. [**](../../../akka/japi/tuple/Tuple5.html#t3:T3 "Permalink")  val t3: T3
23. [**](../../../akka/japi/tuple/Tuple5.html#t4:T4 "Permalink")  val t4: T4
24. [**](../../../akka/japi/tuple/Tuple5.html#t5:T5 "Permalink")  val t5: T5
25. [**](../../../akka/japi/tuple/Tuple5.html#toScala:(T1,T2,T3,T4,T5) "Permalink")  val toScala: (T1, T2, T3, T4, T5)
26. [**](../../../akka/japi/tuple/Tuple5.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../../akka/japi/tuple/Tuple5.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
28. [**](../../../akka/japi/tuple/Tuple5.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/japi/tuple/Tuple5.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/japi/tuple/Tuple5.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Tuple5\[T1, T2, T3, T4, T5] toStringFormat\[Tuple5\[T1, T2, T3, T4, T5]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/japi/tuple/Tuple5.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Tuple5\[T1, T2, T3, T4, T5], B)ImplicitThis member is added by an implicit conversion from Tuple5\[T1, T2, T3, T4, T5] toArrowAssoc\[Tuple5\[T1, T2, T3, T4, T5]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTuple5\[T1, T2, T3, T4, T5] to any2stringadd\[Tuple5\[T1, T2, T3, T4, T5]]

### Inherited by implicit conversion StringFormat fromTuple5\[T1, T2, T3, T4, T5] to StringFormat\[Tuple5\[T1, T2, T3, T4, T5]]

### Inherited by implicit conversion Ensuring fromTuple5\[T1, T2, T3, T4, T5] to Ensuring\[Tuple5\[T1, T2, T3, T4, T5]]

### Inherited by implicit conversion ArrowAssoc fromTuple5\[T1, T2, T3, T4, T5] to ArrowAssoc\[Tuple5\[T1, T2, T3, T4, T5]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple10$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple10.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple11$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple11.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple12$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple12.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple13$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple13.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple14$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple14.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple15$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple15.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple16$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple16.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple17$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple17.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple18$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple18.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple19$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple19.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple20$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple20.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple21$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple21.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple22$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple22.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple3$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple3.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple4$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple4.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple5$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple5.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple6$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple6.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple7$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple7.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple8$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple8.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple9$.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple9.html
- https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple5.html](https://doc.akka.io/api/akka-core/2.10/akka/japi/tuple/Tuple5.html)*