---
description: Alpakka 10.0.2 - akka.stream.alpakka.reference.javadsl.Reference
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:09:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/reference/javadsl/Reference$.html
title: Alpakka 10.0.2 - akka.stream.alpakka.reference.javadsl.Reference
---

# Alpakka 10.0.2 - akka.stream.alpakka.reference.javadsl.Reference

> **Summary:** Alpakka 10.0.2 - akka.stream.alpakka.reference.javadsl.Reference

## Content

Alpakka10\.0\.2 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/stream/index.html "Permalink")  package [stream](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/stream/alpakka/index.html "Permalink")  package [alpakka](../../index.html)Definition Classes[stream](../../../index.html)
- [**](../../../../../akka/stream/alpakka/reference/index.html "Permalink")  package [reference](../index.html)Definition Classes[alpakka](../../index.html)
- [**](../../../../../akka/stream/alpakka/reference/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[reference](../index.html)
- Reference
o[akka](../../../../index.html).[stream](../../../index.html).[alpakka](../../index.html).[reference](../index.html).[javadsl](index.html)

# Reference[**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html "Permalink")

### 

#### object Reference

Source[Reference.scala](https://github.com/akka/alpakka/tree/v10.0.2/reference/src/main/scala/akka/stream/alpakka/reference/javadsl/Reference.scala#L16)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Reference
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#flow():akka.stream.javadsl.Flow[akka.stream.alpakka.reference.ReferenceWriteMessage,akka.stream.alpakka.reference.ReferenceWriteResult,akka.NotUsed] "Permalink")  def flow(): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[ReferenceWriteMessage](../ReferenceWriteMessage.html), [ReferenceWriteResult](../ReferenceWriteResult.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Only convert the flow type, as the materialized value type is the same between Java and Scala.
9. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#flowAsyncMapped(ex:java.util.concurrent.Executor):akka.stream.javadsl.Flow[akka.stream.alpakka.reference.ReferenceWriteMessage,akka.stream.alpakka.reference.ReferenceWriteResult,akka.NotUsed] "Permalink")  def flowAsyncMapped(ex: [Executor](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/Executor.html#java.util.concurrent.Executor)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[ReferenceWriteMessage](../ReferenceWriteMessage.html), [ReferenceWriteResult](../ReferenceWriteResult.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]In Java API take Executor as parameter if the operator needs to perform asynchronous tasks.
10. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#flowWithResource():akka.stream.javadsl.Flow[akka.stream.alpakka.reference.ReferenceWriteMessage,akka.stream.alpakka.reference.ReferenceWriteResult,akka.NotUsed] "Permalink")  def flowWithResource(): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[ReferenceWriteMessage](../ReferenceWriteMessage.html), [ReferenceWriteResult](../ReferenceWriteResult.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]An implementation of a flow that needs access to materializer or attributes during materialization.
11. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
16. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
17. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#source(settings:akka.stream.alpakka.reference.SourceSettings):akka.stream.javadsl.Source[akka.stream.alpakka.reference.ReferenceReadResult,java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def source(settings: [SourceSettings](../SourceSettings.html)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[ReferenceReadResult](../ReferenceReadResult.html), [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]]No Java API at the start of the method doc needed, since the package is dedicated to the Java API.

No Java API at the start of the method doc needed, since the package is dedicated to the Java API.

Call Scala source factory and convert both: the source and materialized values to Java classes.
18. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../../akka/stream/alpakka/reference/javadsl/Reference$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceReadResult.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceWriteMessage.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceWriteResult.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/SourceSettings.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/javadsl/Reference$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/javadsl/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/index.html
- https://doc.akka.io/api/alpakka/10.0.2/index.html

---
*Source: [https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/javadsl/Reference$.html](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/javadsl/Reference$.html)*