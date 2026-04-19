---
description: Akka 2.10.17 - akka.stream.testkit.GraphStageMessages
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:18:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/testkit/GraphStageMessages$.html
title: Akka 2.10.17 - akka.stream.testkit.GraphStageMessages
---

# Akka 2.10.17 - akka.stream.testkit.GraphStageMessages

> **Summary:** Akka 2.10.17 - akka.stream.testkit.GraphStageMessages

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/testkit/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[testkit](index.html)
- [**](../../../akka/stream/testkit/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[testkit](index.html)
- GraphStageMessages
- [TestPublisher](TestPublisher$.html "Provides factory methods for various Publishers.")
- [TestSinkStage](TestSinkStage$.html)
- [TestSourceStage](TestSourceStage$.html)
- [TestSubscriber](TestSubscriber$.html)
o[akka](../../index.html).[stream](../index.html).[testkit](index.html)

# GraphStageMessages[**](../../../akka/stream/testkit/GraphStageMessages$.html "Permalink")

### 

#### object GraphStageMessages

Messages emitted after the corresponding `stageUnderTest` methods has been invoked.

Source[TestGraphStage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-testkit/src/main/scala/akka/stream/testkit/TestGraphStage.scala#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. GraphStageMessages
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/stream/testkit/GraphStageMessages$$Failure.html "Permalink")  case class [Failure](GraphStageMessages$$Failure.html)(ex: Throwable) extends [StageMessage](GraphStageMessages$$StageMessage.html) with [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
2. [**](../../../akka/stream/testkit/GraphStageMessages$$StageFailure.html "Permalink")  case class [StageFailure](GraphStageMessages$$StageFailure.html "Sent to the probe when the operator callback threw an exception")(operation: [StageMessage](GraphStageMessages$$StageMessage.html), exception: Throwable) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSent to the probe when the operator callback threw an exception

Sent to the probe when the operator callback threw an exception

operationThe operation that failed
3. [**](../../../akka/stream/testkit/GraphStageMessages$$StageMessage.html "Permalink") sealed  trait [StageMessage](GraphStageMessages$$StageMessage.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../akka/stream/testkit/GraphStageMessages$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/testkit/GraphStageMessages$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/testkit/GraphStageMessages$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/testkit/GraphStageMessages$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/stream/testkit/GraphStageMessages$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/stream/testkit/GraphStageMessages$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/stream/testkit/GraphStageMessages$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/stream/testkit/GraphStageMessages$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/stream/testkit/GraphStageMessages$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/stream/testkit/GraphStageMessages$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/stream/testkit/GraphStageMessages$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/stream/testkit/GraphStageMessages$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/stream/testkit/GraphStageMessages$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/stream/testkit/GraphStageMessages$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/stream/testkit/GraphStageMessages$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/stream/testkit/GraphStageMessages$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/stream/testkit/GraphStageMessages$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/stream/testkit/GraphStageMessages$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
19. [**](../../../akka/stream/testkit/GraphStageMessages$$DownstreamFinish$.html "Permalink")  case object [DownstreamFinish](GraphStageMessages$$DownstreamFinish$.html) extends [StageMessage](GraphStageMessages$$StageMessage.html) with [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
20. [**](../../../akka/stream/testkit/GraphStageMessages$$Pull$.html "Permalink")  case object [Pull](GraphStageMessages$$Pull$.html) extends [StageMessage](GraphStageMessages$$StageMessage.html) with [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
21. [**](../../../akka/stream/testkit/GraphStageMessages$$Push$.html "Permalink")  case object [Push](GraphStageMessages$$Push$.html) extends [StageMessage](GraphStageMessages$$StageMessage.html) with [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
22. [**](../../../akka/stream/testkit/GraphStageMessages$$UpstreamFinish$.html "Permalink")  case object [UpstreamFinish](GraphStageMessages$$UpstreamFinish$.html) extends [StageMessage](GraphStageMessages$$StageMessage.html) with [NoSerializationVerificationNeeded](../../actor/NoSerializationVerificationNeeded.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Value Members

1. [**](../../../akka/stream/testkit/GraphStageMessages$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/GraphStageMessages$$DownstreamFinish$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/GraphStageMessages$$Failure.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/GraphStageMessages$$Pull$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/GraphStageMessages$$Push$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/GraphStageMessages$$StageFailure.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/GraphStageMessages$$StageMessage.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/GraphStageMessages$$UpstreamFinish$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/GraphStageMessages$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestPublisher$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSinkStage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSourceStage$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/TestSubscriber$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/GraphStageMessages$.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/testkit/GraphStageMessages$.html)*