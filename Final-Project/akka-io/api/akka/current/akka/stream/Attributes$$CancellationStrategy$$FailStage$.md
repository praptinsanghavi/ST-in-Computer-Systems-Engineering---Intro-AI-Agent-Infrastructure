---
description: Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy.FailStage
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:57:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/Attributes$$CancellationStrategy$$FailStage$.html
title: Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy.FailStage
---

# Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy.FailStage

> **Summary:** Akka 2.10.17 - akka.stream.Attributes.CancellationStrategy.FailStage

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/stream/index.html "Permalink")  package [stream](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/stream/Attributes$.html "Permalink")  object [Attributes](Attributes$.html "Note that more attributes for the Materializer are defined in ActorAttributes.") extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Note that more attributes for the [Materializer](Materializer.html) are defined in [ActorAttributes](ActorAttributes$.html).

Note that more attributes for the [Materializer](Materializer.html) are defined in [ActorAttributes](ActorAttributes$.html).

Definition Classes[stream](index.html)
- [**](../../akka/stream/Attributes$$CancellationStrategy$.html "Permalink")  object [CancellationStrategy](Attributes$$CancellationStrategy$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)Definition Classes[Attributes](Attributes$.html)
- [AfterDelay](Attributes$$CancellationStrategy$$AfterDelay.html "Strategy that allows to delay any action when cancelStage is invoked.")
- [CompleteStage](Attributes$$CancellationStrategy$$CompleteStage$.html "Strategy that treats cancelStage the same as completeStage, i.e.")
- FailStage
- [PropagateFailure](Attributes$$CancellationStrategy$$PropagateFailure$.html "Strategy that treats cancelStage in different ways depending on the cause that was given to the cancellation.")
- [Strategy](Attributes$$CancellationStrategy$$Strategy.html "Not for user extension")
o[akka](../index.html).[stream](index.html).[Attributes](Attributes$.html).[CancellationStrategy](Attributes$$CancellationStrategy$.html)

# FailStage[**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html "Permalink")

### 

#### case object FailStage extends [Strategy](Attributes$$CancellationStrategy$$Strategy.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Strategy that treats `cancelStage` the same as `failStage`, i.e. all inlets are cancelled (propagating the
cancellation cause) and all outlets are failed propagating the cause from cancellation.

Source[Attributes.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/Attributes.scala#L466)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Strategy](Attributes$$CancellationStrategy$$Strategy.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FailStage
2. Serializable
3. Product
4. Equals
5. Strategy
6. AnyRef
7. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
10. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
14. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
15. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/stream/Attributes$$CancellationStrategy$$FailStage$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Strategy](Attributes$$CancellationStrategy$$Strategy.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$AfterDelay.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$CompleteStage$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$FailStage$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$PropagateFailure$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$Strategy.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$FailStage$.html](https://doc.akka.io/api/akka/current/akka/stream/Attributes$$CancellationStrategy$$FailStage$.html)*