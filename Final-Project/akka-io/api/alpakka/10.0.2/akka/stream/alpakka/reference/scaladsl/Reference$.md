---
description: Alpakka 10.0.2 - akka.stream.alpakka.reference.scaladsl.Reference
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:09:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/reference/scaladsl/Reference$.html
title: Alpakka 10.0.2 - akka.stream.alpakka.reference.scaladsl.Reference
---

# Alpakka 10.0.2 - akka.stream.alpakka.reference.scaladsl.Reference

> **Summary:** Alpakka 10.0.2 - akka.stream.alpakka.reference.scaladsl.Reference

## Content

Alpakka10\.0\.2 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/stream/index.html "Permalink")  package [stream](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/stream/alpakka/index.html "Permalink")  package [alpakka](../../index.html)Definition Classes[stream](../../../index.html)
- [**](../../../../../akka/stream/alpakka/reference/index.html "Permalink")  package [reference](../index.html)Definition Classes[alpakka](../../index.html)
- [**](../../../../../akka/stream/alpakka/reference/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[reference](../index.html)
- Reference
o[akka](../../../../index.html).[stream](../../../index.html).[alpakka](../../index.html).[reference](../index.html).[scaladsl](index.html)

# Reference[**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html "Permalink")

### 

#### object Reference

Source[Reference.scala](https://github.com/akka/alpakka/tree/v10.0.2/reference/src/main/scala/akka/stream/alpakka/reference/scaladsl/Reference.scala#L16)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#flow():akka.stream.scaladsl.Flow[akka.stream.alpakka.reference.ReferenceWriteMessage,akka.stream.alpakka.reference.ReferenceWriteResult,akka.NotUsed] "Permalink")  def flow(): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ReferenceWriteMessage](../ReferenceWriteMessage.html), [ReferenceWriteResult](../ReferenceWriteResult.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]API doc should describe what will be done to the incoming messages to the flow,
and what messages will be emitted by the flow.
9. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#flowAsyncMapped()(implicitec:scala.concurrent.ExecutionContext):akka.stream.scaladsl.Flow[akka.stream.alpakka.reference.ReferenceWriteMessage,akka.stream.alpakka.reference.ReferenceWriteResult,akka.NotUsed] "Permalink")  def flowAsyncMapped()(implicit ec: [ExecutionContext](https://www.scala-lang.org/api/2.13.17/scala/concurrent/ExecutionContext.html#scala.concurrent.ExecutionContext)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ReferenceWriteMessage](../ReferenceWriteMessage.html), [ReferenceWriteResult](../ReferenceWriteResult.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]If the operator needs an ExecutionContext, take it as an implicit parameter.
10. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#flowWithResource():akka.stream.scaladsl.Flow[akka.stream.alpakka.reference.ReferenceWriteMessage,akka.stream.alpakka.reference.ReferenceWriteResult,akka.NotUsed] "Permalink")  def flowWithResource(): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[ReferenceWriteMessage](../ReferenceWriteMessage.html), [ReferenceWriteResult](../ReferenceWriteResult.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]An implementation of a flow that needs access to materializer or attributes during materialization.
11. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
16. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
17. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#source(settings:akka.stream.alpakka.reference.SourceSettings):akka.stream.scaladsl.Source[akka.stream.alpakka.reference.ReferenceReadResult,scala.concurrent.Future[akka.Done]] "Permalink")  def source(settings: [SourceSettings](../SourceSettings.html)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ReferenceReadResult](../ReferenceReadResult.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]]API doc should describe where the messages are coming from.

API doc should describe where the messages are coming from.

Also describe the significance of the materialized value.
18. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../../../akka/stream/alpakka/reference/scaladsl/Reference$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceReadResult.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceWriteMessage.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/ReferenceWriteResult.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/SourceSettings.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/scaladsl/Reference$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/scaladsl/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/index.html
- https://doc.akka.io/api/alpakka/10.0.2/index.html

---
*Source: [https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/scaladsl/Reference$.html](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/reference/scaladsl/Reference$.html)*