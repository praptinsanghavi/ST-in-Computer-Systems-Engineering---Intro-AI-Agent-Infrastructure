---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.TestFrameworkInterface.Scalatest
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:08:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.TestFrameworkInterface.Scalatest
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.TestFrameworkInterface.Scalatest

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.testkit.TestFrameworkInterface.Scalatest

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/http/index.html "Permalink")  package [http](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../index.html)Definition Classes[http](../../index.html)
- [**](../../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[scaladsl](../index.html)
- [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$.html "Permalink")  object [TestFrameworkInterface](TestFrameworkInterface$.html)Definition Classes[testkit](index.html)
- Scalatest
t[akka](../../../index.html).[http](../../index.html).[scaladsl](../index.html).[testkit](index.html).[TestFrameworkInterface](TestFrameworkInterface$.html)

# Scalatest[**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html "Permalink")

### 

#### trait Scalatest extends [TestFrameworkInterface](TestFrameworkInterface.html) with [BeforeAndAfterAll](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/BeforeAndAfterAll.html#org.scalatest.BeforeAndAfterAll)

Self TypeScalatest with [Suite](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/Suite.html#org.scalatest.Suite)Source[TestFrameworkInterface.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-testkit/src/main/scala/akka/http/scaladsl/testkit/TestFrameworkInterface.scala#L24)Linear Supertypes[BeforeAndAfterAll](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/BeforeAndAfterAll.html#org.scalatest.BeforeAndAfterAll), [SuiteMixin](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/SuiteMixin.html#org.scalatest.SuiteMixin), [TestFrameworkInterface](TestFrameworkInterface.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[ScalatestRouteTest](ScalatestRouteTest.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Scalatest
2. BeforeAndAfterAll
3. SuiteMixin
4. TestFrameworkInterface
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
### Abstract Value Members

1. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#cleanUp():Unit "Permalink") abstract  def cleanUp(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition Classes[TestFrameworkInterface](TestFrameworkInterface.html)
2. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#expectedTestCount(filter:org.scalatest.Filter):Int "Permalink") abstract  def expectedTestCount(filter: [Filter](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/Filter.html#org.scalatest.Filter)): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesSuiteMixin
3. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#nestedSuites:IndexedSeq[org.scalatest.Suite] "Permalink") abstract  def nestedSuites: [IndexedSeq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/IndexedSeq.html#scala.collection.immutable.IndexedSeq)\[[Suite](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/Suite.html#org.scalatest.Suite)]Definition ClassesSuiteMixin
4. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#rerunner:Option[String] "Permalink") abstract  def rerunner: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String]Definition ClassesSuiteMixin
5. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#runNestedSuites(args:org.scalatest.Args):org.scalatest.Status "Permalink") abstract  def runNestedSuites(args: [Args](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/Args.html#org.scalatest.Args)): [Status](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/Status.html#org.scalatest.Status)Attributesprotected Definition ClassesSuiteMixin
6. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#runTest(testName:String,args:org.scalatest.Args):org.scalatest.Status "Permalink") abstract  def runTest(testName: String, args: [Args](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/Args.html#org.scalatest.Args)): [Status](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/Status.html#org.scalatest.Status)Attributesprotected Definition ClassesSuiteMixin
7. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#runTests(testName:Option[String],args:org.scalatest.Args):org.scalatest.Status "Permalink") abstract  def runTests(testName: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], args: [Args](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/Args.html#org.scalatest.Args)): [Status](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/Status.html#org.scalatest.Status)Attributesprotected Definition ClassesSuiteMixin
8. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#suiteId:String "Permalink") abstract  def suiteId: StringDefinition ClassesSuiteMixin
9. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#suiteName:String "Permalink") abstract  def suiteName: StringDefinition ClassesSuiteMixin
10. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#tags:Map[String,Set[String]] "Permalink") abstract  def tags: Map\[String, Set\[String]]Definition ClassesSuiteMixin
11. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#testDataFor(testName:String,theConfigMap:org.scalatest.ConfigMap):org.scalatest.TestData "Permalink") abstract  def testDataFor(testName: String, theConfigMap: [ConfigMap](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/ConfigMap.html#org.scalatest.ConfigMap)): [TestData](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/TestData.html#org.scalatest.TestData)Definition ClassesSuiteMixin
12. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#testNames:Set[String] "Permalink") abstract  def testNames: Set\[String]Definition ClassesSuiteMixin
13. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#styleName:String "Permalink") abstract  val styleName: StringDefinition ClassesSuiteMixinAnnotations@deprecated Deprecated*(Since version 3\.1\.0\)* The styleName lifecycle method has been deprecated and will be removed in a future version of ScalaTest with no replacement.
### Concrete Value Members

1. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Scalatest toany2stringadd\[Scalatest] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Scalatest, B)ImplicitThis member is added by an implicit conversion from Scalatest toArrowAssoc\[Scalatest] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#afterAll():Unit "Permalink")  def afterAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesScalatest → BeforeAndAfterAll
7. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#beforeAll():Unit "Permalink")  def beforeAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected Definition ClassesBeforeAndAfterAll
9. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
10. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Scalatest) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ScalatestImplicitThis member is added by an implicit conversion from Scalatest toEnsuring\[Scalatest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Scalatest) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ScalatestImplicitThis member is added by an implicit conversion from Scalatest toEnsuring\[Scalatest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ScalatestImplicitThis member is added by an implicit conversion from Scalatest toEnsuring\[Scalatest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ScalatestImplicitThis member is added by an implicit conversion from Scalatest toEnsuring\[Scalatest] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
16. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#failTest(msg:String):Nothing "Permalink")  def failTest(msg: String): [Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)Definition ClassesScalatest → [TestFrameworkInterface](TestFrameworkInterface.html)
17. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected:Boolean "Permalink")  val invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesBeforeAndAfterAll
20. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#run(testName:Option[String],args:org.scalatest.Args):org.scalatest.Status "Permalink")  def run(testName: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], args: [Args](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/Args.html#org.scalatest.Args)): [Status](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/Status.html#org.scalatest.Status)Definition ClassesBeforeAndAfterAll → SuiteMixin
25. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#testExceptionHandler:akka.http.scaladsl.server.ExceptionHandler "Permalink")  val testExceptionHandler: [ExceptionHandler](../server/ExceptionHandler.html)Definition ClassesScalatest → [TestFrameworkInterface](TestFrameworkInterface.html)
27. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Scalatest toStringFormat\[Scalatest] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Scalatest, B)ImplicitThis member is added by an implicit conversion from Scalatest toArrowAssoc\[Scalatest] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [BeforeAndAfterAll](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/BeforeAndAfterAll.html#org.scalatest.BeforeAndAfterAll)

### Inherited from [SuiteMixin](https://javadoc.io/page/org.scalatest/scalatest-core_2.13/3.2.19/org/scalatest/SuiteMixin.html#org.scalatest.SuiteMixin)

### Inherited from [TestFrameworkInterface](TestFrameworkInterface.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromScalatest to any2stringadd\[Scalatest]

### Inherited by implicit conversion StringFormat fromScalatest to StringFormat\[Scalatest]

### Inherited by implicit conversion Ensuring fromScalatest to Ensuring\[Scalatest]

### Inherited by implicit conversion ArrowAssoc fromScalatest to ArrowAssoc\[Scalatest]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/ScalatestRouteTest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/TestFrameworkInterface$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/TestFrameworkInterface.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/TestFrameworkInterface$$Scalatest.html)*