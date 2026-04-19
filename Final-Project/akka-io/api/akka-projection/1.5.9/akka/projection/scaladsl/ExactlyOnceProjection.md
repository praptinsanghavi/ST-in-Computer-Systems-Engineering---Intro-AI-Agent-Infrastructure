---
description: Akka Projection 1.5.9 - akka.projection.scaladsl.ExactlyOnceProjection
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:43:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ExactlyOnceProjection.html
title: Akka Projection 1.5.9 - akka.projection.scaladsl.ExactlyOnceProjection
---

# Akka Projection 1.5.9 - akka.projection.scaladsl.ExactlyOnceProjection

> **Summary:** Akka Projection 1.5.9 - akka.projection.scaladsl.ExactlyOnceProjection

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
- ExactlyOnceProjection
- [GroupedProjection](GroupedProjection.html)
- [Handler](Handler.html "Implement this interface for the Envelope handler in the Projection.")
- [HandlerLifecycle](HandlerLifecycle.html)
- [MergeableOffsetSourceProvider](MergeableOffsetSourceProvider.html)
- [ProjectionManagement](ProjectionManagement.html)
- [SourceProvider](SourceProvider.html)
- [StatefulHandler](StatefulHandler.html)
- [VerifiableSourceProvider](VerifiableSourceProvider.html)
t[akka](../../index.html).[projection](../index.html).[scaladsl](index.html)

# ExactlyOnceProjection[**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html "Permalink")

### 

#### trait ExactlyOnceProjection\[Offset, Envelope] extends [Projection](../Projection.html)\[Envelope]

Self TypeExactlyOnceProjection\[Offset, Envelope] with InternalProjectionAnnotations@DoNotInherit() Source[Projections.scala](https://github.com/akka/akka-projection/tree/v1.5.9/akka-projection-core/src/main/scala/akka/projection/scaladsl/Projections.scala#L16)Linear Supertypes[Projection](../Projection.html)\[Envelope], [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ExactlyOnceProjection
2. Projection
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#projectionId:akka.projection.ProjectionId "Permalink") abstract  def projectionId: [ProjectionId](../ProjectionId.html)Definition Classes[Projection](../Projection.html)
2. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#statusObserver:akka.projection.StatusObserver[Envelope] "Permalink") abstract  def statusObserver: [StatusObserver](../StatusObserver.html)\[Envelope]Definition Classes[Projection](../Projection.html)
3. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#withRecoveryStrategy(recoveryStrategy:akka.projection.HandlerRecoveryStrategy):akka.projection.scaladsl.ExactlyOnceProjection[Offset,Envelope] "Permalink") abstract  def withRecoveryStrategy(recoveryStrategy: [HandlerRecoveryStrategy](../HandlerRecoveryStrategy.html)): ExactlyOnceProjection\[Offset, Envelope]
4. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#withRestartBackoff(minBackoff:scala.concurrent.duration.FiniteDuration,maxBackoff:scala.concurrent.duration.FiniteDuration,randomFactor:Double,maxRestarts:Int):akka.projection.scaladsl.ExactlyOnceProjection[Offset,Envelope] "Permalink") abstract  def withRestartBackoff(minBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.15/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.15/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.15/scala/Double.html#scala.Double), maxRestarts: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): ExactlyOnceProjection\[Offset, Envelope]Definition ClassesExactlyOnceProjection → [Projection](../Projection.html)
5. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#withRestartBackoff(minBackoff:scala.concurrent.duration.FiniteDuration,maxBackoff:scala.concurrent.duration.FiniteDuration,randomFactor:Double):akka.projection.scaladsl.ExactlyOnceProjection[Offset,Envelope] "Permalink") abstract  def withRestartBackoff(minBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.15/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.15/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.15/scala/Double.html#scala.Double)): ExactlyOnceProjection\[Offset, Envelope]Definition ClassesExactlyOnceProjection → [Projection](../Projection.html)
6. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#withRestartBackoff(minBackoff:java.time.Duration,maxBackoff:java.time.Duration,randomFactor:Double,maxRestarts:Int):akka.projection.Projection[Envelope] "Permalink") abstract  def withRestartBackoff(minBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maxBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.15/scala/Double.html#scala.Double), maxRestarts: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): [Projection](../Projection.html)\[Envelope]Java API

Java API

Definition Classes[Projection](../Projection.html)
7. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#withRestartBackoff(minBackoff:java.time.Duration,maxBackoff:java.time.Duration,randomFactor:Double):akka.projection.Projection[Envelope] "Permalink") abstract  def withRestartBackoff(minBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maxBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.15/scala/Double.html#scala.Double)): [Projection](../Projection.html)\[Envelope]Java API

Java API

Definition Classes[Projection](../Projection.html)
8. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#withStatusObserver(observer:akka.projection.StatusObserver[Envelope]):akka.projection.scaladsl.ExactlyOnceProjection[Offset,Envelope] "Permalink") abstract  def withStatusObserver(observer: [StatusObserver](../StatusObserver.html)\[Envelope]): ExactlyOnceProjection\[Offset, Envelope]Definition ClassesExactlyOnceProjection → [Projection](../Projection.html)
### Concrete Value Members

1. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/projection/scaladsl/ExactlyOnceProjection.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Projection](../Projection.html)\[Envelope]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/HandlerRecoveryStrategy.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/Projection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/ProjectionId.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/StatusObserver.html
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
- https://doc.akka.io/api/akka-projection/1.5.9/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ExactlyOnceProjection.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ExactlyOnceProjection.html)*