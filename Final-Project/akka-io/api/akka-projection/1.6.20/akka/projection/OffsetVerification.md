---
description: Akka Projection 1.6.20 - akka.projection.OffsetVerification
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/OffsetVerification.html
title: Akka Projection 1.6.20 - akka.projection.OffsetVerification
---

# Akka Projection 1.6.20 - akka.projection.OffsetVerification

> **Summary:** Akka Projection 1.6.20 - akka.projection.OffsetVerification

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
- OffsetVerification
- [Projection](Projection.html "The core abstraction in Akka Projections.")
- [ProjectionBehavior](ProjectionBehavior$.html)
- [ProjectionContext](ProjectionContext.html)
- [ProjectionId](ProjectionId.html)
- [RetryRecoveryStrategy](RetryRecoveryStrategy.html)
- [StatusObserver](StatusObserver.html "Track status of a projection by implementing a StatusObserver and install it using Projection.withStatusObserver.")
- [StrictRecoveryStrategy](StrictRecoveryStrategy.html)
[t](OffsetVerification$.html "See companion object")[akka](../index.html).[projection](index.html)

# [OffsetVerification](OffsetVerification$.html "See companion object")[**](../../akka/projection/OffsetVerification.html "Permalink")

### Companion [object OffsetVerification](OffsetVerification$.html "See companion object")

#### sealed  trait OffsetVerification extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[OffsetVerification.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-core/src/main/scala/akka/projection/OffsetVerification.scala#L11)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[VerificationFailure](OffsetVerification$$VerificationFailure.html), [VerificationSuccess](OffsetVerification$$VerificationSuccess$.html)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. OffsetVerification
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/projection/OffsetVerification.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/projection/OffsetVerification.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/projection/OffsetVerification.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/projection/OffsetVerification.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/projection/OffsetVerification.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../akka/projection/OffsetVerification.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/projection/OffsetVerification.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/projection/OffsetVerification.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../akka/projection/OffsetVerification.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../akka/projection/OffsetVerification.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../akka/projection/OffsetVerification.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/projection/OffsetVerification.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../akka/projection/OffsetVerification.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../akka/projection/OffsetVerification.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../akka/projection/OffsetVerification.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../akka/projection/OffsetVerification.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/projection/OffsetVerification.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../akka/projection/OffsetVerification.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../akka/projection/OffsetVerification.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/OffsetVerification$$VerificationFailure.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/OffsetVerification$$VerificationSuccess$.html
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
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/OffsetVerification.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/OffsetVerification.html)*