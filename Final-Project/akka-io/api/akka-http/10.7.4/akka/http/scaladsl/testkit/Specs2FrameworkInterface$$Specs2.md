---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.Specs2FrameworkInterface.Specs2
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:08:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.Specs2FrameworkInterface.Specs2
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.Specs2FrameworkInterface.Specs2

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.Specs2FrameworkInterface.Specs2

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$.html "Permalink")  object [Specs2FrameworkInterface](Specs2FrameworkInterface$.html)Definition Classes[testkit](index.html)
- Specs2
t[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[testkit](index.html).[Specs2FrameworkInterface](Specs2FrameworkInterface$.html)

# Specs2[**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html "Permalink")

### 

#### trait Specs2 extends [TestFrameworkInterface](TestFrameworkInterface.html) with [AfterAll](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/AfterAll.html#org.specs2.specification.AfterAll)

Source[TestFrameworkInterface.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-testkit/src/main/scala/akka/http/scaladsl/testkit/TestFrameworkInterface.scala#L45)Linear Supertypes[AfterAll](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/AfterAll.html#org.specs2.specification.AfterAll), [FragmentsFactory](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/create/FragmentsFactory.html#org.specs2.specification.create.FragmentsFactory), [SpecificationStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecificationStructure.html#org.specs2.specification.core.SpecificationStructure), [ContextualSpecificationStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/ContextualSpecificationStructure.html#org.specs2.specification.core.ContextualSpecificationStructure), [TestFrameworkInterface](TestFrameworkInterface.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Specs2RouteTest](Specs2RouteTest.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Specs2
2. AfterAll
3. FragmentsFactory
4. SpecificationStructure
5. ContextualSpecificationStructure
6. TestFrameworkInterface
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
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#cleanUp():Unit "Permalink") abstract  def cleanUp(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[TestFrameworkInterface](TestFrameworkInterface.html)
2. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#is:org.specs2.specification.core.SpecStructure "Permalink") abstract  def is: [SpecStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecStructure.html#org.specs2.specification.core.SpecStructure)Definition ClassesSpecificationStructure
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Specs2 toany2stringadd\[Specs2] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Specs2, B)ImplicitThis member is added by an implicit conversion from Specs2 toArrowAssoc\[Specs2] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#afterAll():Unit "Permalink")  def afterAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesSpecs2 → AfterAll
7. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#decorate(is:org.specs2.specification.core.SpecStructure,env:org.specs2.specification.core.Env):org.specs2.specification.core.SpecStructure "Permalink")  def decorate(is: [SpecStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecStructure.html#org.specs2.specification.core.SpecStructure), env: [Env](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Env.html#org.specs2.specification.core.Env)): [SpecStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecStructure.html#org.specs2.specification.core.SpecStructure)Definition ClassesSpecificationStructure
10. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Specs2) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Specs2ImplicitThis member is added by an implicit conversion from Specs2 toEnsuring\[Specs2] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Specs2) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Specs2ImplicitThis member is added by an implicit conversion from Specs2 toEnsuring\[Specs2] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Specs2ImplicitThis member is added by an implicit conversion from Specs2 toEnsuring\[Specs2] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Specs2ImplicitThis member is added by an implicit conversion from Specs2 toEnsuring\[Specs2] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#failTest(msg:String):Nothing "Permalink")  def failTest(msg: String): [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition ClassesSpecs2 → [TestFrameworkInterface](TestFrameworkInterface.html)
17. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#fragmentFactory:org.specs2.specification.create.FragmentFactory "Permalink")  def fragmentFactory: [FragmentFactory](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/create/FragmentFactory.html#org.specs2.specification.create.FragmentFactory)Attributesprotected Definition ClassesFragmentsFactory
18. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#fragments:org.specs2.specification.core.Env=>org.specs2.specification.core.Fragments "Permalink")  def fragments: ([Env](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Env.html#org.specs2.specification.core.Env)) \=\> [Fragments](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Fragments.html#org.specs2.specification.core.Fragments)Definition ClassesContextualSpecificationStructure
19. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#map(fs:=>org.specs2.specification.core.Fragments):org.specs2.specification.core.Fragments "Permalink")  def map(fs: \=\> [Fragments](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Fragments.html#org.specs2.specification.core.Fragments)): [Fragments](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Fragments.html#org.specs2.specification.core.Fragments)Definition ClassesAfterAll → SpecificationStructure
23. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#map(fs:=>org.specs2.specification.core.Fragments,env:org.specs2.specification.core.Env):org.specs2.specification.core.Fragments "Permalink")  def map(fs: \=\> [Fragments](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Fragments.html#org.specs2.specification.core.Fragments), env: [Env](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Env.html#org.specs2.specification.core.Env)): [Fragments](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Fragments.html#org.specs2.specification.core.Fragments)Definition ClassesSpecificationStructure
24. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#map(structure:org.specs2.specification.core.SpecStructure):org.specs2.specification.core.SpecStructure "Permalink")  def map(structure: [SpecStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecStructure.html#org.specs2.specification.core.SpecStructure)): [SpecStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecStructure.html#org.specs2.specification.core.SpecStructure)Definition ClassesSpecificationStructure
25. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#structure:org.specs2.specification.core.Env=>org.specs2.specification.core.SpecStructure "Permalink")  def structure: ([Env](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/Env.html#org.specs2.specification.core.Env)) \=\> [SpecStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecStructure.html#org.specs2.specification.core.SpecStructure)Definition ClassesSpecificationStructure → ContextualSpecificationStructure
29. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#testExceptionHandler:akka.http.scaladsl.server.ExceptionHandler "Permalink")  val testExceptionHandler: [ExceptionHandler](../server/ExceptionHandler.html)Definition ClassesSpecs2 → [TestFrameworkInterface](TestFrameworkInterface.html)
31. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
32. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Specs2 toStringFormat\[Specs2] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Specs2, B)ImplicitThis member is added by an implicit conversion from Specs2 toArrowAssoc\[Specs2] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AfterAll](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/AfterAll.html#org.specs2.specification.AfterAll)

### Inherited from [FragmentsFactory](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/create/FragmentsFactory.html#org.specs2.specification.create.FragmentsFactory)

### Inherited from [SpecificationStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/SpecificationStructure.html#org.specs2.specification.core.SpecificationStructure)

### Inherited from [ContextualSpecificationStructure](https://javadoc.io/page/org.specs2/specs2-core_2.13/4.10.6/org/specs2/specification/core/ContextualSpecificationStructure.html#org.specs2.specification.core.ContextualSpecificationStructure)

### Inherited from [TestFrameworkInterface](TestFrameworkInterface.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromSpecs2 to any2stringadd\[Specs2]

### Inherited by implicit conversion StringFormat fromSpecs2 to StringFormat\[Specs2]

### Inherited by implicit conversion Ensuring fromSpecs2 to Ensuring\[Specs2]

### Inherited by implicit conversion ArrowAssoc fromSpecs2 to ArrowAssoc\[Specs2]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/Specs2FrameworkInterface$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/Specs2RouteTest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/TestFrameworkInterface.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/Specs2FrameworkInterface$$Specs2.html)*