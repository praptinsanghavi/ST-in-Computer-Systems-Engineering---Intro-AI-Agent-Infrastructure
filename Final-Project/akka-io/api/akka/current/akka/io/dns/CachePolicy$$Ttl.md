---
description: Akka 2.10.17 - akka.io.dns.CachePolicy.Ttl
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:26:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/io/dns/CachePolicy$$Ttl.html
title: Akka 2.10.17 - akka.io.dns.CachePolicy.Ttl
---

# Akka 2.10.17 - akka.io.dns.CachePolicy.Ttl

> **Summary:** Akka 2.10.17 - akka.io.dns.CachePolicy.Ttl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/io/index.html "Permalink")  package [io](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/io/dns/index.html "Permalink")  package [dns](index.html)Definition Classes[io](../index.html)
- [**](../../../akka/io/dns/CachePolicy$.html "Permalink")  object [CachePolicy](CachePolicy$.html)Definition Classes[dns](index.html)
- [CachePolicy](CachePolicy$$CachePolicy.html)
- [Forever](CachePolicy$$Forever$.html)
- [Never](CachePolicy$$Never$.html)
- Ttl
[c](CachePolicy$$Ttl$.html "See companion object")[akka](../../index.html).[io](../index.html).[dns](index.html).[CachePolicy](CachePolicy$.html)

# [Ttl](CachePolicy$$Ttl$.html "See companion object")[**](../../../akka/io/dns/CachePolicy$$Ttl.html "Permalink")

### Companion [object Ttl](CachePolicy$$Ttl$.html "See companion object")

#### final  class Ttl extends [CachePolicy](CachePolicy$$CachePolicy.html)

Source[CachePolicy.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/scala/akka/io/dns/CachePolicy.scala#L18)Linear Supertypes[CachePolicy](CachePolicy$$CachePolicy.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Ttl
2. CachePolicy
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
### Value Members

1. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/io/dns/CachePolicy$$Ttl.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Ttl toany2stringadd\[Ttl] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Ttl, B)ImplicitThis member is added by an implicit conversion from Ttl toArrowAssoc\[Ttl] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Ttl) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TtlImplicitThis member is added by an implicit conversion from Ttl toEnsuring\[Ttl] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Ttl) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TtlImplicitThis member is added by an implicit conversion from Ttl toEnsuring\[Ttl] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TtlImplicitThis member is added by an implicit conversion from Ttl toEnsuring\[Ttl] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TtlImplicitThis member is added by an implicit conversion from Ttl toEnsuring\[Ttl] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#equals(other:Any):Boolean "Permalink")  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesTtl → AnyRef → Any
14. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#getValue:java.time.Duration "Permalink")  def getValue: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)
16. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesTtl → AnyRef → Any
17. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesTtl → AnyRef → Any
23. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#value:scala.concurrent.duration.FiniteDuration "Permalink")  val value: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
24. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Ttl toStringFormat\[Ttl] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/io/dns/CachePolicy$$Ttl.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Ttl, B)ImplicitThis member is added by an implicit conversion from Ttl toArrowAssoc\[Ttl] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [CachePolicy](CachePolicy$$CachePolicy.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTtl to any2stringadd\[Ttl]

### Inherited by implicit conversion StringFormat fromTtl to StringFormat\[Ttl]

### Inherited by implicit conversion Ensuring fromTtl to Ensuring\[Ttl]

### Inherited by implicit conversion ArrowAssoc fromTtl to ArrowAssoc\[Ttl]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/dns/CachePolicy$$CachePolicy.html
- https://doc.akka.io/api/akka/current/akka/io/dns/CachePolicy$$Forever$.html
- https://doc.akka.io/api/akka/current/akka/io/dns/CachePolicy$$Never$.html
- https://doc.akka.io/api/akka/current/akka/io/dns/CachePolicy$$Ttl$.html
- https://doc.akka.io/api/akka/current/akka/io/dns/CachePolicy$$Ttl.html
- https://doc.akka.io/api/akka/current/akka/io/dns/CachePolicy$.html
- https://doc.akka.io/api/akka/current/akka/io/dns/index.html
- https://doc.akka.io/api/akka/current/akka/io/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/io/dns/CachePolicy$$Ttl.html](https://doc.akka.io/api/akka/current/akka/io/dns/CachePolicy$$Ttl.html)*