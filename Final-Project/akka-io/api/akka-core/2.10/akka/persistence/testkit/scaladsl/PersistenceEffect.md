---
description: Akka 2.10.17 - akka.persistence.testkit.scaladsl.PersistenceEffect
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:49:14Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/testkit/scaladsl/PersistenceEffect.html
title: Akka 2.10.17 - akka.persistence.testkit.scaladsl.PersistenceEffect
---

# Akka 2.10.17 - akka.persistence.testkit.scaladsl.PersistenceEffect

> **Summary:** Akka 2.10.17 - akka.persistence.testkit.scaladsl.PersistenceEffect

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/testkit/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[testkit](../index.html)
- [EventSourcedBehaviorTestKit](EventSourcedBehaviorTestKit.html)
- PersistenceEffect
- [PersistenceInit](PersistenceInit$.html "Test utility to initialize persistence plugins.")
- [PersistenceProbe](PersistenceProbe.html "Not for user extension")
- [PersistenceTestKit](PersistenceTestKit.html "Class for testing events of persistent actors.")
- [SnapshotTestKit](SnapshotTestKit.html "Class for testing snapshots of persistent actors.")
- [UnpersistentBehavior](UnpersistentBehavior.html)
c[akka](../../../index.html).[persistence](../../index.html).[testkit](../index.html).[scaladsl](index.html)

# PersistenceEffect[**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html "Permalink")

### 

#### final  case class PersistenceEffect\[T](persistedObject: T, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), tags: Set\[String]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[UnpersistentBehavior.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-testkit/src/main/scala/akka/persistence/testkit/scaladsl/UnpersistentBehavior.scala#L85)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PersistenceEffect
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

1. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#<init>(persistedObject:T,sequenceNr:Long,tags:Set[String]):akka.persistence.testkit.scaladsl.PersistenceEffect[T] "Permalink")  new PersistenceEffect(persistedObject: T, sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), tags: Set\[String])
### Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PersistenceEffect\[T] toany2stringadd\[PersistenceEffect\[T]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PersistenceEffect\[T], B)ImplicitThis member is added by an implicit conversion from PersistenceEffect\[T] toArrowAssoc\[PersistenceEffect\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PersistenceEffect\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceEffect\[T]ImplicitThis member is added by an implicit conversion from PersistenceEffect\[T] toEnsuring\[PersistenceEffect\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PersistenceEffect\[T]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceEffect\[T]ImplicitThis member is added by an implicit conversion from PersistenceEffect\[T] toEnsuring\[PersistenceEffect\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PersistenceEffect\[T]ImplicitThis member is added by an implicit conversion from PersistenceEffect\[T] toEnsuring\[PersistenceEffect\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PersistenceEffect\[T]ImplicitThis member is added by an implicit conversion from PersistenceEffect\[T] toEnsuring\[PersistenceEffect\[T]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#persistedObject:T "Permalink")  val persistedObject: T
19. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
20. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#sequenceNr:Long "Permalink")  val sequenceNr: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
21. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#tags:Set[String] "Permalink")  val tags: Set\[String]
23. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PersistenceEffect\[T] toStringFormat\[PersistenceEffect\[T]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/testkit/scaladsl/PersistenceEffect.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PersistenceEffect\[T], B)ImplicitThis member is added by an implicit conversion from PersistenceEffect\[T] toArrowAssoc\[PersistenceEffect\[T]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPersistenceEffect\[T] to any2stringadd\[PersistenceEffect\[T]]

### Inherited by implicit conversion StringFormat fromPersistenceEffect\[T] to StringFormat\[PersistenceEffect\[T]]

### Inherited by implicit conversion Ensuring fromPersistenceEffect\[T] to Ensuring\[PersistenceEffect\[T]]

### Inherited by implicit conversion ArrowAssoc fromPersistenceEffect\[T] to ArrowAssoc\[PersistenceEffect\[T]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/EventSourcedBehaviorTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceEffect.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceInit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceProbe.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/SnapshotTestKit.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/UnpersistentBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceEffect.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/testkit/scaladsl/PersistenceEffect.html)*