---
description: Akka 2.10.17 - akka.testkit.internal.NativeImageUtils
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:19:09Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/internal/NativeImageUtils.html
title: Akka 2.10.17 - akka.testkit.internal.NativeImageUtils
---

# Akka 2.10.17 - akka.testkit.internal.NativeImageUtils

> **Summary:** Akka 2.10.17 - akka.testkit.internal.NativeImageUtils

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/testkit/internal/index.html "Permalink")  package [internal](index.html)Definition Classes[testkit](../index.html)
- NativeImageUtils
[c](NativeImageUtils$.html "See companion object")[akka](../../index.html).[testkit](../index.html).[internal](index.html)

# [NativeImageUtils](NativeImageUtils$.html "See companion object")[**](../../../akka/testkit/internal/NativeImageUtils.html "Permalink")

### Companion [object NativeImageUtils](NativeImageUtils$.html "See companion object")

#### class NativeImageUtils extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

INTERNAL API

Annotations@[InternalApi](../../annotation/InternalApi.html)() Source[NativeImageUtils.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/internal/NativeImageUtils.scala#L79)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. NativeImageUtils
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
### Instance Constructors

1. [**](../../../akka/testkit/internal/NativeImageUtils.html#<init>(akkaModule:String,additionalEntries:Seq[akka.testkit.internal.NativeImageUtils.ReflectConfigEntry],packageNames:Seq[String]):akka.testkit.internal.NativeImageUtils "Permalink")  new NativeImageUtils(akkaModule: String, additionalEntries: Seq\[[ReflectConfigEntry](NativeImageUtils$$ReflectConfigEntry.html)], packageNames: Seq\[String])
### Value Members

1. [**](../../../akka/testkit/internal/NativeImageUtils.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/testkit/internal/NativeImageUtils.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/testkit/internal/NativeImageUtils.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from NativeImageUtils toany2stringadd\[NativeImageUtils] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/testkit/internal/NativeImageUtils.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (NativeImageUtils, B)ImplicitThis member is added by an implicit conversion from NativeImageUtils toArrowAssoc\[NativeImageUtils] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/testkit/internal/NativeImageUtils.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/testkit/internal/NativeImageUtils.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/testkit/internal/NativeImageUtils.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/testkit/internal/NativeImageUtils.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (NativeImageUtils) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NativeImageUtilsImplicitThis member is added by an implicit conversion from NativeImageUtils toEnsuring\[NativeImageUtils] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/testkit/internal/NativeImageUtils.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (NativeImageUtils) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NativeImageUtilsImplicitThis member is added by an implicit conversion from NativeImageUtils toEnsuring\[NativeImageUtils] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/testkit/internal/NativeImageUtils.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): NativeImageUtilsImplicitThis member is added by an implicit conversion from NativeImageUtils toEnsuring\[NativeImageUtils] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/testkit/internal/NativeImageUtils.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): NativeImageUtilsImplicitThis member is added by an implicit conversion from NativeImageUtils toEnsuring\[NativeImageUtils] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/testkit/internal/NativeImageUtils.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/testkit/internal/NativeImageUtils.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../akka/testkit/internal/NativeImageUtils.html#generateMetadata():String "Permalink")  def generateMetadata(): String
15. [**](../../../akka/testkit/internal/NativeImageUtils.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/testkit/internal/NativeImageUtils.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/testkit/internal/NativeImageUtils.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/testkit/internal/NativeImageUtils.html#metadataDir:java.nio.file.Path "Permalink")  val metadataDir: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path)
19. [**](../../../akka/testkit/internal/NativeImageUtils.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/testkit/internal/NativeImageUtils.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/testkit/internal/NativeImageUtils.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/testkit/internal/NativeImageUtils.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/testkit/internal/NativeImageUtils.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/testkit/internal/NativeImageUtils.html#verifyMetadata():(String,String) "Permalink")  def verifyMetadata(): (String, String)For use in tests, throws if existing metadata in given dir does exist, else returns the pre\-existing metadata and the
metadata scanned from current classpath for comparing with test library comparison utils.
25. [**](../../../akka/testkit/internal/NativeImageUtils.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/testkit/internal/NativeImageUtils.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../../akka/testkit/internal/NativeImageUtils.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../../akka/testkit/internal/NativeImageUtils.html#writeMetadata():Unit "Permalink")  def writeMetadata(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Generate GraalVM/NativeImage metadata by scanning the classpath for dynamically loaded extension points of Akka.
### Deprecated Value Members

1. [**](../../../akka/testkit/internal/NativeImageUtils.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/testkit/internal/NativeImageUtils.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from NativeImageUtils toStringFormat\[NativeImageUtils] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/testkit/internal/NativeImageUtils.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (NativeImageUtils, B)ImplicitThis member is added by an implicit conversion from NativeImageUtils toArrowAssoc\[NativeImageUtils] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromNativeImageUtils to any2stringadd\[NativeImageUtils]

### Inherited by implicit conversion StringFormat fromNativeImageUtils to StringFormat\[NativeImageUtils]

### Inherited by implicit conversion Ensuring fromNativeImageUtils to Ensuring\[NativeImageUtils]

### Inherited by implicit conversion ArrowAssoc fromNativeImageUtils to ArrowAssoc\[NativeImageUtils]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/InternalApi.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/internal/NativeImageUtils$$ReflectConfigEntry.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/internal/NativeImageUtils$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/internal/NativeImageUtils.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/testkit/internal/NativeImageUtils.html](https://doc.akka.io/api/akka-core/2.10/akka/testkit/internal/NativeImageUtils.html)*