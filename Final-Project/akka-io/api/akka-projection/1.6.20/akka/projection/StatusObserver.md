---
description: Akka Projection 1.6.20 - akka.projection.StatusObserver
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:40:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/StatusObserver.html
title: Akka Projection 1.6.20 - akka.projection.StatusObserver
---

# Akka Projection 1.6.20 - akka.projection.StatusObserver

> **Summary:** Akka Projection 1.6.20 - akka.projection.StatusObserver

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/projection/index.html "Permalink")  package [projection](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/projection/cassandra/index.html "Permalink")  package [cassandra](cassandra/index.html)Definition Classes[projection](index.html)
- [**](../../akka/projection/dynamodb/index.html "Permalink")  package [dynamodb](dynamodb/index.html)Definition Classes[projection](index.html)
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
- [AllowSeqNrGapsMetadata](AllowSeqNrGapsMetadata.html)
- [BySlicesSourceProvider](BySlicesSourceProvider.html "Implemented by EventSourcedProvider and DurableStateSourceProvider.")
- [HandlerRecoveryStrategy](HandlerRecoveryStrategy.html "Error handling strategy when processing an Envelope fails.")
- [MergeableOffset](MergeableOffset.html)
- [OffsetVerification](OffsetVerification.html)
- [Projection](Projection.html "The core abstraction in Akka Projections.")
- [ProjectionBehavior](ProjectionBehavior$.html)
- [ProjectionContext](ProjectionContext.html)
- [ProjectionId](ProjectionId.html)
- [RetryRecoveryStrategy](RetryRecoveryStrategy.html)
- StatusObserver
- [StrictRecoveryStrategy](StrictRecoveryStrategy.html)
c[akka](../index.html).[projection](index.html)

# StatusObserver[**](../../akka/projection/StatusObserver.html "Permalink")

### 

#### abstract  class StatusObserver\[\-Envelope] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Track status of a projection by implementing a `StatusObserver` and install it using
[Projection.withStatusObserver](Projection.html#withStatusObserver(observer:akka.projection.StatusObserver[Envelope]):akka.projection.Projection[Envelope]).

Source[StatusObserver.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-core/src/main/scala/akka/projection/StatusObserver.scala#L11)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StatusObserver
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/projection/StatusObserver.html#<init>():akka.projection.StatusObserver[Envelope] "Permalink")  new StatusObserver()
### Abstract Value Members

1. [**](../../akka/projection/StatusObserver.html#afterProcess(projectionId:akka.projection.ProjectionId,envelope:Envelope):Unit "Permalink") abstract  def afterProcess(projectionId: [ProjectionId](ProjectionId.html), envelope: Envelope): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Invoked as soon as the projected information is readable by a separate thread (e.g
committed to database).

Invoked as soon as the projected information is readable by a separate thread (e.g
committed to database). It will not be invoked if the envelope is skipped or
handling fails.
2. [**](../../akka/projection/StatusObserver.html#beforeProcess(projectionId:akka.projection.ProjectionId,envelope:Envelope):Unit "Permalink") abstract  def beforeProcess(projectionId: [ProjectionId](ProjectionId.html), envelope: Envelope): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called as soon as an envelope is ready to be processed.

Called as soon as an envelope is ready to be processed. The envelope processing may
not start immediately if grouping or batching are enabled.
3. [**](../../akka/projection/StatusObserver.html#error(projectionId:akka.projection.ProjectionId,env:Envelope,cause:Throwable,recoveryStrategy:akka.projection.HandlerRecoveryStrategy):Unit "Permalink") abstract  def error(projectionId: [ProjectionId](ProjectionId.html), env: Envelope, cause: Throwable, recoveryStrategy: [HandlerRecoveryStrategy](HandlerRecoveryStrategy.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when processing of an envelope failed.

Called when processing of an envelope failed. The invocation of this method is not guaranteed
when the handler failure causes a stream failure (e.g. using a Flow\-based handler or a recovery
strategy that immediately fails).

From the `recoveryStrategy` and keeping track how many times `error` is called it's possible to derive
what next step will be; fail, skip, retry.
4. [**](../../akka/projection/StatusObserver.html#failed(projectionId:akka.projection.ProjectionId,cause:Throwable):Unit "Permalink") abstract  def failed(projectionId: [ProjectionId](ProjectionId.html), cause: Throwable): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when a projection failed.

Called when a projection failed.

The projection will be restarted unless the projection restart backoff settings
are configured with `max-restarts` limit.
5. [**](../../akka/projection/StatusObserver.html#offsetProgress(projectionId:akka.projection.ProjectionId,env:Envelope):Unit "Permalink") abstract  def offsetProgress(projectionId: [ProjectionId](ProjectionId.html), env: Envelope): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when the corresponding offset has been stored.

Called when the corresponding offset has been stored.
It might not be called for each envelope.
6. [**](../../akka/projection/StatusObserver.html#started(projectionId:akka.projection.ProjectionId):Unit "Permalink") abstract  def started(projectionId: [ProjectionId](ProjectionId.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when a projection is started.

Called when a projection is started.
Also called after the projection has been restarted.
7. [**](../../akka/projection/StatusObserver.html#stopped(projectionId:akka.projection.ProjectionId):Unit "Permalink") abstract  def stopped(projectionId: [ProjectionId](ProjectionId.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when a projection is stopped.

Called when a projection is stopped.
Also called before the projection is restarted.
### Concrete Value Members

1. [**](../../akka/projection/StatusObserver.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/projection/StatusObserver.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/projection/StatusObserver.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/projection/StatusObserver.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/projection/StatusObserver.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../akka/projection/StatusObserver.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/projection/StatusObserver.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/projection/StatusObserver.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../akka/projection/StatusObserver.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../akka/projection/StatusObserver.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../akka/projection/StatusObserver.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/projection/StatusObserver.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../akka/projection/StatusObserver.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../akka/projection/StatusObserver.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../akka/projection/StatusObserver.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../akka/projection/StatusObserver.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/projection/StatusObserver.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../akka/projection/StatusObserver.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/projection/StatusObserver.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/AllowSeqNrGapsMetadata$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/AllowSeqNrGapsMetadata.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/BySlicesSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/HandlerRecoveryStrategy$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/HandlerRecoveryStrategy.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/OffsetVerification$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/OffsetVerification.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/Projection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionBehavior$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionContext.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionId$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionId.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/RetryRecoveryStrategy.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/StatusObserver.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/StrictRecoveryStrategy.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/dynamodb/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/eventsourced/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/internal/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/jdbc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/kafka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/slick/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/state/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/testkit/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/StatusObserver.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/StatusObserver.html)*