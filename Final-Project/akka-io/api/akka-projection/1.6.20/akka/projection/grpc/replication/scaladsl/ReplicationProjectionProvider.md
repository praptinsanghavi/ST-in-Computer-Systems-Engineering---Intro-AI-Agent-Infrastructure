---
description: Akka Projection 1.6.20 - akka.projection.grpc.replication.scaladsl.ReplicationProjectionProvider
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:02:58Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html
title: Akka Projection 1.6.20 - akka.projection.grpc.replication.scaladsl.ReplicationProjectionProvider
---

# Akka Projection 1.6.20 - akka.projection.grpc.replication.scaladsl.ReplicationProjectionProvider

> **Summary:** Akka Projection 1.6.20 - akka.projection.grpc.replication.scaladsl.ReplicationProjectionProvider

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/projection/index.html "Permalink")  package [projection](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/projection/grpc/index.html "Permalink")  package [grpc](../../index.html)Definition Classes[projection](../../../index.html)
- [**](../../../../../akka/projection/grpc/replication/index.html "Permalink")  package [replication](../index.html)Definition Classes[grpc](../../index.html)
- [**](../../../../../akka/projection/grpc/replication/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[replication](../index.html)
- [Replica](Replica.html "Not for user extension, construct using Replica.apply")
- [ReplicatedBehaviors](ReplicatedBehaviors.html "Dynamically provides factory methods for creating replicated event sourced behaviors.")
- [Replication](Replication.html "Created using Replication.grpcReplication, which starts sharding with the entity and replication stream consumers but not the replication endpoint needed to publish events to other replication places.")
- ReplicationProjectionProvider
- [ReplicationSettings](ReplicationSettings.html "Not for user extension.")
t[akka](../../../../index.html).[projection](../../../index.html).[grpc](../../index.html).[replication](../index.html).[scaladsl](index.html)

# ReplicationProjectionProvider[**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html "Permalink")

### 

#### trait ReplicationProjectionProvider extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Factory/function for creating the projection where offsets are kept track of for the replication streams

Annotations@FunctionalInterface() Source[ReplicationProjectionProvider.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-grpc/src/main/scala/akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.scala#L22)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ReplicationProjectionProvider
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#apply(projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.scaladsl.SourceProvider[akka.persistence.query.Offset,akka.persistence.query.typed.EventEnvelope[AnyRef]],replicationFlow:akka.stream.scaladsl.FlowWithContext[akka.persistence.query.typed.EventEnvelope[AnyRef],akka.projection.ProjectionContext,akka.Done,akka.projection.ProjectionContext,akka.NotUsed],system:akka.actor.typed.ActorSystem[_]):akka.projection.scaladsl.AtLeastOnceFlowProjection[akka.persistence.query.Offset,akka.persistence.query.typed.EventEnvelope[AnyRef]] "Permalink") abstract  def apply(projectionId: [ProjectionId](../../../ProjectionId.html), sourceProvider: [SourceProvider](../../../scaladsl/SourceProvider.html)\[[Offset](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/Offset.html#akka.persistence.query.Offset), [EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]], replicationFlow: [FlowWithContext](https://doc.akka.io/api/akka-core/2.10.13/akka/stream/scaladsl/FlowWithContext.html#akka.stream.scaladsl.FlowWithContext)\[[EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)], [ProjectionContext](../../../ProjectionContext.html), [Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done), [ProjectionContext](../../../ProjectionContext.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.13/akka/NotUsed.html#akka.NotUsed)], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [AtLeastOnceFlowProjection](../../../scaladsl/AtLeastOnceFlowProjection.html)\[[Offset](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/Offset.html#akka.persistence.query.Offset), [EventEnvelope](https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html#akka.persistence.query.typed.EventEnvelope)\[[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]]
### Concrete Value Members

1. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
18. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionContext.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionId.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/Replica$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/Replica.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicatedBehaviors.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/Replication$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/Replication.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationSettings$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/AtLeastOnceFlowProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html)*