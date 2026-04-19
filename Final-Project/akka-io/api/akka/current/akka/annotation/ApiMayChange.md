---
description: Akka 2.10.17 - akka.annotation.ApiMayChange
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:45:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/annotation/ApiMayChange.html
title: Akka 2.10.17 - akka.annotation.ApiMayChange
---

# Akka 2.10.17 - akka.annotation.ApiMayChange

> **Summary:** Akka 2.10.17 - akka.annotation.ApiMayChange

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/annotation/index.html "Permalink")  package [annotation](index.html)Definition Classes[akka](../index.html)
- ApiMayChange
- [DoNotInherit](DoNotInherit.html)
- [InternalApi](InternalApi.html)
- [InternalStableApi](InternalStableApi.html)
t[akka](../index.html).[annotation](index.html)

# ApiMayChange[**](../../akka/annotation/ApiMayChange.html "Permalink")

### 

#### trait ApiMayChange extends [Annotation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/annotation/Annotation.html#java.lang.annotation.Annotation)

Annotations@Documented() @Retention() @Target() Source[ApiMayChange.java](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor/src/main/java/akka/annotation/ApiMayChange.java#L36)Linear Supertypes[Annotation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/annotation/Annotation.html#java.lang.annotation.Annotation), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ApiMayChange
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

1. [**](../../akka/annotation/ApiMayChange.html#annotationType():Class[_<:java.lang.annotation.Annotation] "Permalink") abstract  def annotationType(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [Annotation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/annotation/Annotation.html#java.lang.annotation.Annotation)]Definition ClassesAnnotation
2. [**](../../akka/annotation/ApiMayChange.html#issue():String "Permalink") abstract  def issue(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Reference to issue discussing the future evolvement of this API

Reference to issue discussing the future evolvement of this API

Annotations@AnnotationDefault()
### Concrete Value Members

1. [**](../../akka/annotation/ApiMayChange.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/annotation/ApiMayChange.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/annotation/ApiMayChange.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ApiMayChange toany2stringadd\[ApiMayChange] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../akka/annotation/ApiMayChange.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ApiMayChange, B)ImplicitThis member is added by an implicit conversion from ApiMayChange toArrowAssoc\[ApiMayChange] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../akka/annotation/ApiMayChange.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../akka/annotation/ApiMayChange.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../akka/annotation/ApiMayChange.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../akka/annotation/ApiMayChange.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ApiMayChange) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ApiMayChangeImplicitThis member is added by an implicit conversion from ApiMayChange toEnsuring\[ApiMayChange] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../akka/annotation/ApiMayChange.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ApiMayChange) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ApiMayChangeImplicitThis member is added by an implicit conversion from ApiMayChange toEnsuring\[ApiMayChange] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../akka/annotation/ApiMayChange.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ApiMayChangeImplicitThis member is added by an implicit conversion from ApiMayChange toEnsuring\[ApiMayChange] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../akka/annotation/ApiMayChange.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ApiMayChangeImplicitThis member is added by an implicit conversion from ApiMayChange toEnsuring\[ApiMayChange] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../akka/annotation/ApiMayChange.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/annotation/ApiMayChange.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/annotation/ApiMayChange.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/annotation/ApiMayChange.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../akka/annotation/ApiMayChange.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/annotation/ApiMayChange.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/annotation/ApiMayChange.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../akka/annotation/ApiMayChange.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../akka/annotation/ApiMayChange.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/annotation/ApiMayChange.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/annotation/ApiMayChange.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/annotation/ApiMayChange.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../akka/annotation/ApiMayChange.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/annotation/ApiMayChange.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../akka/annotation/ApiMayChange.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ApiMayChange toStringFormat\[ApiMayChange] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../akka/annotation/ApiMayChange.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ApiMayChange, B)ImplicitThis member is added by an implicit conversion from ApiMayChange toArrowAssoc\[ApiMayChange] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Annotation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/annotation/Annotation.html#java.lang.annotation.Annotation)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromApiMayChange to any2stringadd\[ApiMayChange]

### Inherited by implicit conversion StringFormat fromApiMayChange to StringFormat\[ApiMayChange]

### Inherited by implicit conversion Ensuring fromApiMayChange to Ensuring\[ApiMayChange]

### Inherited by implicit conversion ArrowAssoc fromApiMayChange to ArrowAssoc\[ApiMayChange]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka/current/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka/current/akka/annotation/InternalStableApi.html
- https://doc.akka.io/api/akka/current/akka/annotation/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html](https://doc.akka.io/api/akka/current/akka/annotation/ApiMayChange.html)*