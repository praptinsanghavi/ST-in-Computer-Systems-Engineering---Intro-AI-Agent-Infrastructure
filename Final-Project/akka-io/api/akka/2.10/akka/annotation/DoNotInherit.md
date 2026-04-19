---
description: Akka 2.10.17 - akka.annotation.DoNotInherit
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:26:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/annotation/DoNotInherit.html
title: Akka 2.10.17 - akka.annotation.DoNotInherit
---

# Akka 2.10.17 - akka.annotation.DoNotInherit

> **Summary:** Akka 2.10.17 - akka.annotation.DoNotInherit

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](index.html)Definition Classes[akka](../index.html)
- [ApiMayChange](ApiMayChange.html)
- DoNotInherit
- [InternalApi](InternalApi.html)
- [InternalStableApi](InternalStableApi.html)
t[akka](../index.html).[annotation](index.html)

# DoNotInherit[**](../../akka/annotation/DoNotInherit.html "Permalink")

### 

#### trait DoNotInherit extends [Annotation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/annotation/Annotation.html#java.lang.annotation.Annotation)

Annotations@Documented() @Retention() @Target() Source[DoNotInherit.java](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/java/akka/annotation/DoNotInherit.java#L27)Linear Supertypes[Annotation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/annotation/Annotation.html#java.lang.annotation.Annotation), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. DoNotInherit
2. Annotation
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
### Abstract Value Members

1. [**](../../akka/annotation/DoNotInherit.html#annotationType():Class[_<:java.lang.annotation.Annotation] "Permalink") abstract  def annotationType(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [Annotation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/annotation/Annotation.html#java.lang.annotation.Annotation)]Definition ClassesAnnotation
### Concrete Value Members

1. [**](../../akka/annotation/DoNotInherit.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/annotation/DoNotInherit.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/annotation/DoNotInherit.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from DoNotInherit toany2stringadd\[DoNotInherit] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/annotation/DoNotInherit.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (DoNotInherit, B)ImplicitThis member is added by an implicit conversion from DoNotInherit toArrowAssoc\[DoNotInherit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/annotation/DoNotInherit.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/annotation/DoNotInherit.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/annotation/DoNotInherit.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/annotation/DoNotInherit.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (DoNotInherit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DoNotInheritImplicitThis member is added by an implicit conversion from DoNotInherit toEnsuring\[DoNotInherit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/annotation/DoNotInherit.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (DoNotInherit) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DoNotInheritImplicitThis member is added by an implicit conversion from DoNotInherit toEnsuring\[DoNotInherit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/annotation/DoNotInherit.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): DoNotInheritImplicitThis member is added by an implicit conversion from DoNotInherit toEnsuring\[DoNotInherit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/annotation/DoNotInherit.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): DoNotInheritImplicitThis member is added by an implicit conversion from DoNotInherit toEnsuring\[DoNotInherit] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/annotation/DoNotInherit.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/annotation/DoNotInherit.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/annotation/DoNotInherit.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/annotation/DoNotInherit.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/annotation/DoNotInherit.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/annotation/DoNotInherit.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/annotation/DoNotInherit.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/annotation/DoNotInherit.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/annotation/DoNotInherit.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/annotation/DoNotInherit.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/annotation/DoNotInherit.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/annotation/DoNotInherit.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/annotation/DoNotInherit.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/annotation/DoNotInherit.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/annotation/DoNotInherit.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from DoNotInherit toStringFormat\[DoNotInherit] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/annotation/DoNotInherit.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (DoNotInherit, B)ImplicitThis member is added by an implicit conversion from DoNotInherit toArrowAssoc\[DoNotInherit] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Annotation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/annotation/Annotation.html#java.lang.annotation.Annotation)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromDoNotInherit to any2stringadd\[DoNotInherit]

### Inherited by implicit conversion StringFormat fromDoNotInherit to StringFormat\[DoNotInherit]

### Inherited by implicit conversion Ensuring fromDoNotInherit to Ensuring\[DoNotInherit]

### Inherited by implicit conversion ArrowAssoc fromDoNotInherit to ArrowAssoc\[DoNotInherit]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka/2.10/akka/annotation/index.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/annotation/DoNotInherit.html](https://doc.akka.io/api/akka/2.10/akka/annotation/DoNotInherit.html)*