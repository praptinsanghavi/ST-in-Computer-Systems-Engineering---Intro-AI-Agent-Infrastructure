---
description: Akka Projection 1.6.20 - akka.projection.testkit.scaladsl.TestSourceProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:38:40Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/TestSourceProvider.html
title: Akka Projection 1.6.20 - akka.projection.testkit.scaladsl.TestSourceProvider
---

# Akka Projection 1.6.20 - akka.projection.testkit.scaladsl.TestSourceProvider

> **Summary:** Akka Projection 1.6.20 - akka.projection.testkit.scaladsl.TestSourceProvider

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/projection/index.html "Permalink")  package [projection](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/projection/testkit/index.html "Permalink")  package [testkit](../index.html)Definition Classes[projection](../../index.html)
- [**](../../../../akka/projection/testkit/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[testkit](../index.html)
- [ProjectionTestKit](ProjectionTestKit.html)
- [TestOffsetStore](TestOffsetStore.html)
- [TestProjection](TestProjection.html)
- TestSourceProvider
[t](TestSourceProvider$.html "See companion object")[akka](../../../index.html).[projection](../../index.html).[testkit](../index.html).[scaladsl](index.html)

# [TestSourceProvider](TestSourceProvider$.html "See companion object")[**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html "Permalink")

### Companion [object TestSourceProvider](TestSourceProvider$.html "See companion object")

#### trait TestSourceProvider\[Offset, Envelope] extends [VerifiableSourceProvider](../../scaladsl/VerifiableSourceProvider.html)\[Offset, Envelope]

Source[TestSourceProvider.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-testkit/src/main/scala/akka/projection/testkit/scaladsl/TestSourceProvider.scala#L34)Linear Supertypes[VerifiableSourceProvider](../../scaladsl/VerifiableSourceProvider.html)\[Offset, Envelope], [SourceProvider](../../scaladsl/SourceProvider.html)\[Offset, Envelope], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. TestSourceProvider
2. VerifiableSourceProvider
3. SourceProvider
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#extractCreationTime(envelope:Envelope):Long "Permalink") abstract  def extractCreationTime(envelope: Envelope): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Timestamp (in millis\-since\-epoch) of the instant when the envelope was created.

Timestamp (in millis\-since\-epoch) of the instant when the envelope was created. The meaning of "when the
envelope was created" is implementation specific and could be an instant on the producer machine, or the
instant when the database persisted the envelope, or other.

Definition Classes[SourceProvider](../../scaladsl/SourceProvider.html)
2. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#extractOffset(envelope:Envelope):Offset "Permalink") abstract  def extractOffset(envelope: Envelope): OffsetDefinition Classes[SourceProvider](../../scaladsl/SourceProvider.html)
3. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#source(offset:()=>scala.concurrent.Future[Option[Offset]]):scala.concurrent.Future[akka.stream.scaladsl.Source[Envelope,akka.NotUsed]] "Permalink") abstract  def source(offset: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Offset]]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Source](https://doc.akka.io/api/akka-core/2.10.13/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[Envelope, [NotUsed](https://doc.akka.io/api/akka-core/2.10.13/akka/NotUsed.html#akka.NotUsed)]]Definition Classes[SourceProvider](../../scaladsl/SourceProvider.html)
4. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#verifyOffset(offset:Offset):akka.projection.OffsetVerification "Permalink") abstract  def verifyOffset(offset: Offset): [OffsetVerification](../../OffsetVerification.html)Definition Classes[VerifiableSourceProvider](../../scaladsl/VerifiableSourceProvider.html)
5. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#withAllowCompletion(allowCompletion:Boolean):akka.projection.testkit.scaladsl.TestSourceProvider[Offset,Envelope] "Permalink") abstract  def withAllowCompletion(allowCompletion: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestSourceProvider\[Offset, Envelope]Allow the sourceEvents Source to complete or stay open indefinitely.
6. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#withExtractCreationTimeFunction(extractCreationTimeFn:Envelope=>Long):akka.projection.testkit.scaladsl.TestSourceProvider[Offset,Envelope] "Permalink") abstract  def withExtractCreationTimeFunction(extractCreationTimeFn: (Envelope) \=\> [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): TestSourceProvider\[Offset, Envelope]A user\-defined function to extract the event creation time from an envelope.
7. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#withOffsetVerification(verifyOffsetFn:Offset=>akka.projection.OffsetVerification):akka.projection.testkit.scaladsl.TestSourceProvider[Offset,Envelope] "Permalink") abstract  def withOffsetVerification(verifyOffsetFn: (Offset) \=\> [OffsetVerification](../../OffsetVerification.html)): TestSourceProvider\[Offset, Envelope]A user\-defined function to verify offsets.
8. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#withStartSourceFrom(startSourceFromFn:(Offset,Offset)=>Boolean):akka.projection.testkit.scaladsl.TestSourceProvider[Offset,Envelope] "Permalink") abstract  def withStartSourceFrom(startSourceFromFn: (Offset, Offset) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TestSourceProvider\[Offset, Envelope]A user\-defined function to compare the last offset returned by the offset store with the offset in the source
to filter out previously processed offsets.

A user\-defined function to compare the last offset returned by the offset store with the offset in the source
to filter out previously processed offsets.

First parameter: Last offset processed. Second parameter this envelope's offset from sourceEvents.
### Concrete Value Members

1. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/projection/testkit/scaladsl/TestSourceProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [VerifiableSourceProvider](../../scaladsl/VerifiableSourceProvider.html)\[Offset, Envelope]

### Inherited from [SourceProvider](../../scaladsl/SourceProvider.html)\[Offset, Envelope]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/OffsetVerification.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/VerifiableSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/ProjectionTestKit$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/ProjectionTestKit.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/TestOffsetStore.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/TestProjection$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/TestProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/TestSourceProvider$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/TestSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/TestSourceProvider.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/scaladsl/TestSourceProvider.html)*