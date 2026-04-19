---
description: Akka Projection 1.5.9 - akka.projection.scaladsl.VerifiableSourceProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:43:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/VerifiableSourceProvider.html
title: Akka Projection 1.5.9 - akka.projection.scaladsl.VerifiableSourceProvider
---

# Akka Projection 1.5.9 - akka.projection.scaladsl.VerifiableSourceProvider

> **Summary:** Akka Projection 1.5.9 - akka.projection.scaladsl.VerifiableSourceProvider

## Content

Akka Projection1\.5\.9 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/projection/index.html "Permalink")  package [projection](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/projection/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[projection](../index.html)
- [ActorHandler](ActorHandler.html "This Handler gives support for spawning an actor of a given Behavior to delegate processing of the envelopes to the actor.")
- [AtLeastOnceFlowProjection](AtLeastOnceFlowProjection.html)
- [AtLeastOnceProjection](AtLeastOnceProjection.html)
- [AtMostOnceProjection](AtMostOnceProjection.html)
- [ExactlyOnceProjection](ExactlyOnceProjection.html)
- [GroupedProjection](GroupedProjection.html)
- [Handler](Handler.html "Implement this interface for the Envelope handler in the Projection.")
- [HandlerLifecycle](HandlerLifecycle.html)
- [MergeableOffsetSourceProvider](MergeableOffsetSourceProvider.html)
- [ProjectionManagement](ProjectionManagement.html)
- [SourceProvider](SourceProvider.html)
- [StatefulHandler](StatefulHandler.html)
- VerifiableSourceProvider
t[akka](../../index.html).[projection](../index.html).[scaladsl](index.html)

# VerifiableSourceProvider[**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html "Permalink")

### 

#### trait VerifiableSourceProvider\[Offset, Envelope] extends [SourceProvider](SourceProvider.html)\[Offset, Envelope]

Source[SourceProvider.scala](https://github.com/akka/akka-projection/tree/v1.5.9/akka-projection-core/src/main/scala/akka/projection/scaladsl/SourceProvider.scala#L29)Linear Supertypes[SourceProvider](SourceProvider.html)\[Offset, Envelope], [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)Known Subclasses[TestSourceProvider](../testkit/scaladsl/TestSourceProvider.html)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. VerifiableSourceProvider
2. SourceProvider
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#extractCreationTime(envelope:Envelope):Long "Permalink") abstract  def extractCreationTime(envelope: Envelope): [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)Timestamp (in millis\-since\-epoch) of the instant when the envelope was created.

Timestamp (in millis\-since\-epoch) of the instant when the envelope was created. The meaning of "when the
envelope was created" is implementation specific and could be an instant on the producer machine, or the
instant when the database persisted the envelope, or other.

Definition Classes[SourceProvider](SourceProvider.html)
2. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#extractOffset(envelope:Envelope):Offset "Permalink") abstract  def extractOffset(envelope: Envelope): OffsetDefinition Classes[SourceProvider](SourceProvider.html)
3. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#source(offset:()=>scala.concurrent.Future[Option[Offset]]):scala.concurrent.Future[akka.stream.scaladsl.Source[Envelope,akka.NotUsed]] "Permalink") abstract  def source(offset: () \=\> [Future](https://www.scala-lang.org/api/2.13.15/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.15/scala/Option.html#scala.Option)\[Offset]]): [Future](https://www.scala-lang.org/api/2.13.15/scala/concurrent/Future.html#scala.concurrent.Future)\[[Source](https://doc.akka.io/api/akka/2.9.6/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[Envelope, [NotUsed](https://doc.akka.io/api/akka/2.9.6/akka/NotUsed.html#akka.NotUsed)]]Definition Classes[SourceProvider](SourceProvider.html)
4. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#verifyOffset(offset:Offset):akka.projection.OffsetVerification "Permalink") abstract  def verifyOffset(offset: Offset): [OffsetVerification](../OffsetVerification.html)
### Concrete Value Members

1. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/projection/scaladsl/VerifiableSourceProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [SourceProvider](SourceProvider.html)\[Offset, Envelope]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/OffsetVerification.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ActorHandler.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/AtLeastOnceFlowProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/AtLeastOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/AtMostOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ExactlyOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/GroupedProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/Handler$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/HandlerLifecycle.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/MergeableOffsetSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ProjectionManagement$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ProjectionManagement.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/StatefulHandler.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/VerifiableSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/testkit/scaladsl/TestSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/index.html
- https://doc.akka.io/api/akka/2.9.6/akka/NotUsed.html
- https://doc.akka.io/api/akka/2.9.6/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/VerifiableSourceProvider.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/VerifiableSourceProvider.html)*