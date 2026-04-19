---
description: Akka Projection 1.6.20 - akka.projection.javadsl.SourceProvider
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html
title: Akka Projection 1.6.20 - akka.projection.javadsl.SourceProvider
---

# Akka Projection 1.6.20 - akka.projection.javadsl.SourceProvider

> **Summary:** Akka Projection 1.6.20 - akka.projection.javadsl.SourceProvider

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/projection/index.html "Permalink")  package [projection](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/projection/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[projection](../index.html)
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
- SourceProvider
- [StatefulHandler](StatefulHandler.html)
- [VerifiableSourceProvider](VerifiableSourceProvider.html)
c[akka](../../index.html).[projection](../index.html).[javadsl](index.html)

# SourceProvider[**](../../../akka/projection/javadsl/SourceProvider.html "Permalink")

### 

#### abstract  class SourceProvider\[Offset, Envelope] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[SourceProvider.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-core/src/main/scala/akka/projection/javadsl/SourceProvider.scala#L15)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[MergeableOffsetSourceProvider](MergeableOffsetSourceProvider.html), [VerifiableSourceProvider](VerifiableSourceProvider.html), [TestSourceProvider](../testkit/javadsl/TestSourceProvider.html)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SourceProvider
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/projection/javadsl/SourceProvider.html#<init>():akka.projection.javadsl.SourceProvider[Offset,Envelope] "Permalink")  new SourceProvider()
### Abstract Value Members

1. [**](../../../akka/projection/javadsl/SourceProvider.html#extractCreationTime(envelope:Envelope):Long "Permalink") abstract  def extractCreationTime(envelope: Envelope): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Timestamp (in millis\-since\-epoch) of the instant when the envelope was created.

Timestamp (in millis\-since\-epoch) of the instant when the envelope was created. The meaning of "when the
envelope was created" is implementation specific and could be an instant on the producer machine, or the
instant when the database persisted the envelope, or other.
2. [**](../../../akka/projection/javadsl/SourceProvider.html#extractOffset(envelope:Envelope):Offset "Permalink") abstract  def extractOffset(envelope: Envelope): Offset
3. [**](../../../akka/projection/javadsl/SourceProvider.html#source(offset:java.util.function.Supplier[java.util.concurrent.CompletionStage[java.util.Optional[Offset]]]):java.util.concurrent.CompletionStage[akka.stream.javadsl.Source[Envelope,akka.NotUsed]] "Permalink") abstract  def source(offset: [Supplier](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[Offset]]]): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Source](https://doc.akka.io/api/akka-core/2.10.13/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[Envelope, [NotUsed](https://doc.akka.io/api/akka-core/2.10.13/akka/NotUsed.html#akka.NotUsed)]]
### Concrete Value Members

1. [**](../../../akka/projection/javadsl/SourceProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/projection/javadsl/SourceProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/projection/javadsl/SourceProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/projection/javadsl/SourceProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/projection/javadsl/SourceProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../akka/projection/javadsl/SourceProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/projection/javadsl/SourceProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/projection/javadsl/SourceProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../akka/projection/javadsl/SourceProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../akka/projection/javadsl/SourceProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/projection/javadsl/SourceProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/projection/javadsl/SourceProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../../akka/projection/javadsl/SourceProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../akka/projection/javadsl/SourceProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/projection/javadsl/SourceProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/projection/javadsl/SourceProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/projection/javadsl/SourceProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/projection/javadsl/SourceProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/projection/javadsl/SourceProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/ActorHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/AtLeastOnceFlowProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/AtLeastOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/AtMostOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/ExactlyOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/GroupedProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/Handler$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/HandlerLifecycle.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/MergeableOffsetSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/ProjectionManagement$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/ProjectionManagement.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/StatefulHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/VerifiableSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/javadsl/TestSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html)*