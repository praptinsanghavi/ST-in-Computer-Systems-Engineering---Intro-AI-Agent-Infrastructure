---
description: Akka 2.10.17 - akka.stream.testkit.TestSourceStage
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:33:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/testkit/TestSourceStage$.html
title: Akka 2.10.17 - akka.stream.testkit.TestSourceStage
---

# Akka 2.10.17 - akka.stream.testkit.TestSourceStage

> **Summary:** Akka 2.10.17 - akka.stream.testkit.TestSourceStage

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/testkit/index.html "Permalink")  package [testkit](index.html)Definition Classes[stream](../index.html)
- [**](../../../akka/stream/testkit/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[testkit](index.html)
- [**](../../../akka/stream/testkit/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[testkit](index.html)
- [GraphStageMessages](GraphStageMessages$.html "Messages emitted after the corresponding stageUnderTest methods has been invoked.")
- [TestPublisher](TestPublisher$.html "Provides factory methods for various Publishers.")
- [TestSinkStage](TestSinkStage$.html)
- TestSourceStage
- [TestSubscriber](TestSubscriber$.html)
o[akka](../../index.html).[stream](../index.html).[testkit](index.html)

# TestSourceStage[**](../../../akka/stream/testkit/TestSourceStage$.html "Permalink")

### 

#### object TestSourceStage

Source[TestGraphStage.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-testkit/src/main/scala/akka/stream/testkit/TestGraphStage.scala#L98)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestSourceStage
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/stream/testkit/TestSourceStage$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/testkit/TestSourceStage$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/testkit/TestSourceStage$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/testkit/TestSourceStage$.html#apply[T,M](stageUnderTest:akka.stream.stage.GraphStageWithMaterializedValue[akka.stream.SourceShape[T],M],probe:akka.testkit.TestProbe):akka.stream.scaladsl.Source[T,M] "Permalink")  def apply\[T, M](stageUnderTest: [GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html)\[[SourceShape](../SourceShape.html)\[T], M], probe: [TestProbe](../../testkit/TestProbe.html)): [Source](../scaladsl/Source.html)\[T, M]Creates a source out of the `stageUnderTest` that will inform the `probe`
of operator events and callbacks by sending it the various messages found under
[GraphStageMessages](GraphStageMessages$.html).

Creates a source out of the `stageUnderTest` that will inform the `probe`
of operator events and callbacks by sending it the various messages found under
[GraphStageMessages](GraphStageMessages$.html).

This allows for creation of a "normal" stream starting with the source while still being
able to assert internal events.
5. [**](../../../akka/stream/testkit/TestSourceStage$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/stream/testkit/TestSourceStage$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/stream/testkit/TestSourceStage$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/stream/testkit/TestSourceStage$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/stream/testkit/TestSourceStage$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/stream/testkit/TestSourceStage$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/stream/testkit/TestSourceStage$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/stream/testkit/TestSourceStage$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/stream/testkit/TestSourceStage$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/stream/testkit/TestSourceStage$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/testkit/TestSourceStage$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../../akka/stream/testkit/TestSourceStage$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
17. [**](../../../akka/stream/testkit/TestSourceStage$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/stream/testkit/TestSourceStage$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../akka/stream/testkit/TestSourceStage$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/testkit/TestSourceStage$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka/current/akka/stream/stage/GraphStageWithMaterializedValue.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/GraphStageMessages$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestPublisher$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSinkStage$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSourceStage$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSubscriber$.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/index.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/stream/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/testkit/TestProbe.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSourceStage$.html](https://doc.akka.io/api/akka/current/akka/stream/testkit/TestSourceStage$.html)*