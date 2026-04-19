---
description: Akka 2.10.17 - akka.testkit.TestActor.KeepRunning
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:19:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/testkit/TestActor$$KeepRunning$.html
title: Akka 2.10.17 - akka.testkit.TestActor.KeepRunning
---

# Akka 2.10.17 - akka.testkit.TestActor.KeepRunning

> **Summary:** Akka 2.10.17 - akka.testkit.TestActor.KeepRunning

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/testkit/TestActor$.html "Permalink")  object [TestActor](TestActor$.html)Definition Classes[testkit](index.html)
- [AutoPilot](TestActor$$AutoPilot.html)
- KeepRunning
- [Message](TestActor$$Message.html)
- [NoAutoPilot](TestActor$$NoAutoPilot$.html)
- [NullMessage](TestActor$$NullMessage$.html)
- [RealMessage](TestActor$$RealMessage.html)
- [SetAutoPilot](TestActor$$SetAutoPilot.html)
- [SetIgnore](TestActor$$SetIgnore.html)
- [Spawn](TestActor$$Spawn.html)
- [UnWatch](TestActor$$UnWatch.html)
- [Watch](TestActor$$Watch.html)
o[akka](../index.html).[testkit](index.html).[TestActor](TestActor$.html)

# KeepRunning[**](../../akka/testkit/TestActor$$KeepRunning$.html "Permalink")

### 

#### case object KeepRunning extends [AutoPilot](TestActor$$AutoPilot.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

Source[TestKit.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-testkit/src/main/scala/akka/testkit/TestKit.scala#L39)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [AutoPilot](TestActor$$AutoPilot.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. KeepRunning
2. Serializable
3. Product
4. Equals
5. AutoPilot
6. AnyRef
7. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/testkit/TestActor$$KeepRunning$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/testkit/TestActor$$KeepRunning$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/testkit/TestActor$$KeepRunning$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/testkit/TestActor$$KeepRunning$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/testkit/TestActor$$KeepRunning$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/testkit/TestActor$$KeepRunning$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/testkit/TestActor$$KeepRunning$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/testkit/TestActor$$KeepRunning$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/testkit/TestActor$$KeepRunning$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
10. [**](../../akka/testkit/TestActor$$KeepRunning$.html#keepRunning:akka.testkit.TestActor.AutoPilot "Permalink")  def keepRunning: [AutoPilot](TestActor$$AutoPilot.html)Definition Classes[AutoPilot](TestActor$$AutoPilot.html)
11. [**](../../akka/testkit/TestActor$$KeepRunning$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/testkit/TestActor$$KeepRunning$.html#noAutoPilot:akka.testkit.TestActor.AutoPilot "Permalink")  def noAutoPilot: [AutoPilot](TestActor$$AutoPilot.html)Definition Classes[AutoPilot](TestActor$$AutoPilot.html)
13. [**](../../akka/testkit/TestActor$$KeepRunning$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/testkit/TestActor$$KeepRunning$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../akka/testkit/TestActor$$KeepRunning$.html#productElementName(n:Int):String "Permalink")  def productElementName(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): StringDefinition ClassesProduct
16. [**](../../akka/testkit/TestActor$$KeepRunning$.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
17. [**](../../akka/testkit/TestActor$$KeepRunning$.html#run(sender:akka.actor.ActorRef,msg:Any):akka.testkit.TestActor.AutoPilot "Permalink")  def run(sender: [ActorRef](../actor/ActorRef.html), msg: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [AutoPilot](TestActor$$AutoPilot.html)Definition ClassesKeepRunning → [AutoPilot](TestActor$$AutoPilot.html)
18. [**](../../akka/testkit/TestActor$$KeepRunning$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../akka/testkit/TestActor$$KeepRunning$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../akka/testkit/TestActor$$KeepRunning$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../akka/testkit/TestActor$$KeepRunning$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/testkit/TestActor$$KeepRunning$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [AutoPilot](TestActor$$AutoPilot.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$$AutoPilot.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$$KeepRunning$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$$Message.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$$NoAutoPilot$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$$NullMessage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$$RealMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$$SetAutoPilot.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$$SetIgnore.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$$Spawn.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$$UnWatch.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$$Watch.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$$KeepRunning$.html](https://doc.akka.io/api/akka-core/2.10/akka/testkit/TestActor$$KeepRunning$.html)*