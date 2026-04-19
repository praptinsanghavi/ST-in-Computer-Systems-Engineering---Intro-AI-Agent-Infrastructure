---
description: Akka 2.10.17 - akka.persistence.typed.crdt.LwwTime
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:49:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/crdt/LwwTime.html
title: Akka 2.10.17 - akka.persistence.typed.crdt.LwwTime
---

# Akka 2.10.17 - akka.persistence.typed.crdt.LwwTime

> **Summary:** Akka 2.10.17 - akka.persistence.typed.crdt.LwwTime

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/crdt/index.html "Permalink")  package [crdt](index.html)Definition Classes[typed](../index.html)
- [Counter](Counter.html)
- LwwTime
- [ORSet](ORSet.html "Implements a 'Observed Remove Set' operation based CRDT, also called a 'OR-Set'.")
- [OpCrdt](OpCrdt.html)
c[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html).[crdt](index.html)

# LwwTime[**](../../../../akka/persistence/typed/crdt/LwwTime.html "Permalink")

### 

#### final  case class LwwTime(timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), originReplica: [ReplicaId](../ReplicaId.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Utility class for comparing timestamp replica
identifier when implementing last\-writer wins.

Source[LwwTime.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/main/scala/akka/persistence/typed/crdt/LwwTime.scala#L12)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. LwwTime
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

1. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#<init>(timestamp:Long,originReplica:akka.persistence.typed.ReplicaId):akka.persistence.typed.crdt.LwwTime "Permalink")  new LwwTime(timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), originReplica: [ReplicaId](../ReplicaId.html))
### Value Members

1. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/persistence/typed/crdt/LwwTime.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from LwwTime toany2stringadd\[LwwTime] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (LwwTime, B)ImplicitThis member is added by an implicit conversion from LwwTime toArrowAssoc\[LwwTime] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (LwwTime) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LwwTimeImplicitThis member is added by an implicit conversion from LwwTime toEnsuring\[LwwTime] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (LwwTime) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LwwTimeImplicitThis member is added by an implicit conversion from LwwTime toEnsuring\[LwwTime] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): LwwTimeImplicitThis member is added by an implicit conversion from LwwTime toEnsuring\[LwwTime] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): LwwTimeImplicitThis member is added by an implicit conversion from LwwTime toEnsuring\[LwwTime] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#increase(t:Long,replicaId:akka.persistence.typed.ReplicaId):akka.persistence.typed.crdt.LwwTime "Permalink")  def increase(t: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), replicaId: [ReplicaId](../ReplicaId.html)): LwwTimeCreate a new `LwwTime` that has a `timestamp` that is
`max` of the given timestamp and previous timestamp \+ 1,
i.e.

Create a new `LwwTime` that has a `timestamp` that is
`max` of the given timestamp and previous timestamp \+ 1,
i.e. monotonically increasing.
15. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#isAfter(other:akka.persistence.typed.crdt.LwwTime):Boolean "Permalink")  def isAfter(other: LwwTime): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Compare this `LwwTime` with the `other`.

Compare this `LwwTime` with the `other`.
Greatest timestamp wins. If both timestamps are
equal the `dc` identifiers are compared and the
one sorted first in alphanumeric order wins.
16. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#originReplica:akka.persistence.typed.ReplicaId "Permalink")  val originReplica: [ReplicaId](../ReplicaId.html)
21. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
22. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#timestamp:Long "Permalink")  val timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)
24. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from LwwTime toStringFormat\[LwwTime] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/persistence/typed/crdt/LwwTime.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (LwwTime, B)ImplicitThis member is added by an implicit conversion from LwwTime toArrowAssoc\[LwwTime] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromLwwTime to any2stringadd\[LwwTime]

### Inherited by implicit conversion StringFormat fromLwwTime to StringFormat\[LwwTime]

### Inherited by implicit conversion Ensuring fromLwwTime to Ensuring\[LwwTime]

### Inherited by implicit conversion ArrowAssoc fromLwwTime to ArrowAssoc\[LwwTime]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/crdt/Counter$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/crdt/Counter.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/crdt/LwwTime.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/crdt/ORSet$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/crdt/ORSet.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/crdt/OpCrdt.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/crdt/LwwTime.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/crdt/LwwTime.html)*