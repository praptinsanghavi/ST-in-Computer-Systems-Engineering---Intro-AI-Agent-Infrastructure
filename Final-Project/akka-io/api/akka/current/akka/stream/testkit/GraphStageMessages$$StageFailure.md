---
description: Akka 2.10.17 - akka.stream.testkit.GraphStageMessages.StageFailure
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:01Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/testkit/GraphStageMessages$$StageFailure.html
title: Akka 2.10.17 - akka.stream.testkit.GraphStageMessages.StageFailure
---

# Akka 2.10.17 - akka.stream.testkit.GraphStageMessages.StageFailure

> **Summary:** Akka 2.10.17 - akka.stream.testkit.GraphStageMessages.StageFailure

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/testkit/GraphStageMessages$.html "Permalink")  object [GraphStageMessages](GraphStageMessages$.html "Messages emitted after the corresponding stageUnderTest methods has been invoked.")Messages emitted after the corresponding `stageUnderTest` methods has been invoked.

Messages emitted after the corresponding `stageUnderTest` methods has been invoked.

Definition Classes[testkit](index.html)
- [DownstreamFinish](GraphStageMessages$$DownstreamFinish$.html)
- [Failure](GraphStageMessages$$Failure.html)
- [Pull](GraphStageMessages$$Pull$.html)
- [Push](GraphStageMessages$$Push$.html)
- StageFailure
- [StageMessage](GraphStageMessages$$StageMessage.html)
- [UpstreamFinish](GraphStageMessages$$UpstreamFinish$.html)
c[akka](../../index.html).[stream](../index.html).[testkit](index.html).[GraphStageMessages](GraphStageMessages$.html)

# StageFailure[**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html "Permalink")

### 

#### case class StageFailure(operation: [StageMessage](GraphStageMessages$$StageMessage.html), exception: Throwable) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Sent to the probe when the operator callback threw an exception

operationThe operation that failed

Source[TestGraphStage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-testkit/src/main/scala/akka/stream/testkit/TestGraphStage.scala#L31)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StageFailure
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

1. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#<init>(operation:akka.stream.testkit.GraphStageMessages.StageMessage,exception:Throwable):akka.stream.testkit.GraphStageMessages.StageFailure "Permalink")  new StageFailure(operation: [StageMessage](GraphStageMessages$$StageMessage.html), exception: Throwable)operationThe operation that failed
### Value Members

1. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from StageFailure toany2stringadd\[StageFailure] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (StageFailure, B)ImplicitThis member is added by an implicit conversion from StageFailure toArrowAssoc\[StageFailure] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (StageFailure) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StageFailureImplicitThis member is added by an implicit conversion from StageFailure toEnsuring\[StageFailure] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (StageFailure) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StageFailureImplicitThis member is added by an implicit conversion from StageFailure toEnsuring\[StageFailure] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): StageFailureImplicitThis member is added by an implicit conversion from StageFailure toEnsuring\[StageFailure] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): StageFailureImplicitThis member is added by an implicit conversion from StageFailure toEnsuring\[StageFailure] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#exception:Throwable "Permalink")  val exception: Throwable
14. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#operation:akka.stream.testkit.GraphStageMessages.StageMessage "Permalink")  val operation: [StageMessage](GraphStageMessages$$StageMessage.html)
20. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
21. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from StageFailure toStringFormat\[StageFailure] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (StageFailure, B)ImplicitThis member is added by an implicit conversion from StageFailure toArrowAssoc\[StageFailure] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromStageFailure to any2stringadd\[StageFailure]

### Inherited by implicit conversion StringFormat fromStageFailure to StringFormat\[StageFailure]

### Inherited by implicit conversion Ensuring fromStageFailure to Ensuring\[StageFailure]

### Inherited by implicit conversion ArrowAssoc fromStageFailure to ArrowAssoc\[StageFailure]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/GraphStageMessages$$DownstreamFinish$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/GraphStageMessages$$Failure.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/GraphStageMessages$$Pull$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/GraphStageMessages$$Push$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/GraphStageMessages$$StageFailure.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/GraphStageMessages$$StageMessage.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/GraphStageMessages$$UpstreamFinish$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/GraphStageMessages$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/testkit/GraphStageMessages$$StageFailure.html](https://doc.akka.io/api/akka/current/akka/stream/testkit/GraphStageMessages$$StageFailure.html)*