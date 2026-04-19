---
description: Akka Projection 1.5.9 - akka.projection.Projection
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:43:04Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/Projection.html
title: Akka Projection 1.5.9 - akka.projection.Projection
---

# Akka Projection 1.5.9 - akka.projection.Projection

> **Summary:** Akka Projection 1.5.9 - akka.projection.Projection

## Content

Akka Projection1\.5\.9 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/projection/index.html "Permalink")  package [projection](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/projection/cassandra/index.html "Permalink")  package [cassandra](cassandra/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/eventsourced/index.html "Permalink")  package [eventsourced](eventsourced/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/grpc/index.html "Permalink")  package [grpc](grpc/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/jdbc/index.html "Permalink")  package [jdbc](jdbc/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/kafka/index.html "Permalink")  package [kafka](kafka/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/r2dbc/index.html "Permalink")  package [r2dbc](r2dbc/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/slick/index.html "Permalink")  package [slick](slick/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/state/index.html "Permalink")  package [state](state/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[projection](index.html)
- [BySlicesSourceProvider](BySlicesSourceProvider.html "Implemented by EventSourcedProvider and DurableStateSourceProvider.")
- [HandlerRecoveryStrategy](HandlerRecoveryStrategy.html "Error handling strategy when processing an Envelope fails.")
- [MergeableOffset](MergeableOffset.html)
- [OffsetVerification](OffsetVerification.html)
- Projection
- [ProjectionBehavior](ProjectionBehavior$.html)
- [ProjectionContext](ProjectionContext.html)
- [ProjectionId](ProjectionId.html)
- [RetryRecoveryStrategy](RetryRecoveryStrategy.html)
- [StatusObserver](StatusObserver.html "Track status of a projection by implementing a StatusObserver and install it using Projection.withStatusObserver.")
- [StrictRecoveryStrategy](StrictRecoveryStrategy.html)
t[akka](../index.html).[projection](index.html)

# Projection[**](../../akka/projection/Projection.html "Permalink")

### 

#### trait Projection\[Envelope] extends [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)

The core abstraction in Akka Projections.

A projection instance may share the same name and Envelope, but must have a unique key. The key is used
to achieve processing parallelism for a projection.

For example, many projections may share the same name "user\-events\-projection", but can process events for
different sharded entities within Akka Cluster, where key could be the Akka Cluster shardId.

EnvelopeThe envelope type of the projection.

Source[Projection.scala](https://github.com/akka/akka-projection/tree/v1.5.9/akka-projection-core/src/main/scala/akka/projection/Projection.scala#L31)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)Known Subclasses[AtLeastOnceFlowProjection](javadsl/AtLeastOnceFlowProjection.html), [AtLeastOnceProjection](javadsl/AtLeastOnceProjection.html), [AtMostOnceProjection](javadsl/AtMostOnceProjection.html), [ExactlyOnceProjection](javadsl/ExactlyOnceProjection.html), [GroupedProjection](javadsl/GroupedProjection.html), [AtLeastOnceFlowProjection](scaladsl/AtLeastOnceFlowProjection.html), [AtLeastOnceProjection](scaladsl/AtLeastOnceProjection.html), [AtMostOnceProjection](scaladsl/AtMostOnceProjection.html), [ExactlyOnceProjection](scaladsl/ExactlyOnceProjection.html), [GroupedProjection](scaladsl/GroupedProjection.html), [TestProjection](testkit/javadsl/TestProjection.html), [TestProjection](testkit/scaladsl/TestProjection.html)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Projection
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../akka/projection/Projection.html#projectionId:akka.projection.ProjectionId "Permalink") abstract  def projectionId: [ProjectionId](ProjectionId.html)
2. [**](../../akka/projection/Projection.html#statusObserver:akka.projection.StatusObserver[Envelope] "Permalink") abstract  def statusObserver: [StatusObserver](StatusObserver.html)\[Envelope]
3. [**](../../akka/projection/Projection.html#withRestartBackoff(minBackoff:java.time.Duration,maxBackoff:java.time.Duration,randomFactor:Double,maxRestarts:Int):akka.projection.Projection[Envelope] "Permalink") abstract  def withRestartBackoff(minBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maxBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.15/scala/Double.html#scala.Double), maxRestarts: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): Projection\[Envelope]Java API
4. [**](../../akka/projection/Projection.html#withRestartBackoff(minBackoff:java.time.Duration,maxBackoff:java.time.Duration,randomFactor:Double):akka.projection.Projection[Envelope] "Permalink") abstract  def withRestartBackoff(minBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), maxBackoff: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.15/scala/Double.html#scala.Double)): Projection\[Envelope]Java API
5. [**](../../akka/projection/Projection.html#withRestartBackoff(minBackoff:scala.concurrent.duration.FiniteDuration,maxBackoff:scala.concurrent.duration.FiniteDuration,randomFactor:Double,maxRestarts:Int):akka.projection.Projection[Envelope] "Permalink") abstract  def withRestartBackoff(minBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.15/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.15/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.15/scala/Double.html#scala.Double), maxRestarts: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): Projection\[Envelope]
6. [**](../../akka/projection/Projection.html#withRestartBackoff(minBackoff:scala.concurrent.duration.FiniteDuration,maxBackoff:scala.concurrent.duration.FiniteDuration,randomFactor:Double):akka.projection.Projection[Envelope] "Permalink") abstract  def withRestartBackoff(minBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.15/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maxBackoff: [FiniteDuration](https://www.scala-lang.org/api/2.13.15/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), randomFactor: [Double](https://www.scala-lang.org/api/2.13.15/scala/Double.html#scala.Double)): Projection\[Envelope]
7. [**](../../akka/projection/Projection.html#withStatusObserver(observer:akka.projection.StatusObserver[Envelope]):akka.projection.Projection[Envelope] "Permalink") abstract  def withStatusObserver(observer: [StatusObserver](StatusObserver.html)\[Envelope]): Projection\[Envelope]
### Concrete Value Members

1. [**](../../akka/projection/Projection.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/projection/Projection.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/projection/Projection.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/projection/Projection.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/projection/Projection.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../akka/projection/Projection.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/projection/Projection.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/projection/Projection.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../akka/projection/Projection.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../akka/projection/Projection.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../akka/projection/Projection.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/projection/Projection.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../akka/projection/Projection.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../akka/projection/Projection.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../akka/projection/Projection.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../akka/projection/Projection.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/projection/Projection.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../akka/projection/Projection.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/projection/Projection.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/BySlicesSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/HandlerRecoveryStrategy$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/HandlerRecoveryStrategy.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/MergeableOffset.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/OffsetVerification$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/OffsetVerification.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/Projection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/ProjectionBehavior$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/ProjectionContext.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/ProjectionId$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/ProjectionId.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/RetryRecoveryStrategy.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/StatusObserver.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/StrictRecoveryStrategy.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/cassandra/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/eventsourced/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/internal/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/AtLeastOnceFlowProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/AtLeastOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/AtMostOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/ExactlyOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/GroupedProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/jdbc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/kafka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/r2dbc/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/AtLeastOnceFlowProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/AtLeastOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/AtMostOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ExactlyOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/GroupedProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/slick/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/state/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/testkit/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/testkit/javadsl/TestProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/testkit/scaladsl/TestProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/Projection.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/Projection.html)*