---
description: Akka Projection 1.6.20 - akka.projection.cassandra.scaladsl.CassandraProjection
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/scaladsl/CassandraProjection$.html
title: Akka Projection 1.6.20 - akka.projection.cassandra.scaladsl.CassandraProjection
---

# Akka Projection 1.6.20 - akka.projection.cassandra.scaladsl.CassandraProjection

> **Summary:** Akka Projection 1.6.20 - akka.projection.cassandra.scaladsl.CassandraProjection

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/projection/index.html "Permalink")  package [projection](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/projection/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[projection](../../index.html)
- [**](../../../../akka/projection/cassandra/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[cassandra](../index.html)
- CassandraProjection
o[akka](../../../index.html).[projection](../../index.html).[cassandra](../index.html).[scaladsl](index.html)

# CassandraProjection[**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html "Permalink")

### 

#### object CassandraProjection

Factories of [akka.projection.Projection](../../Projection.html) where the offset is stored in Cassandra. The envelope handler can
integrate with anything, such as publishing to a message broker, or updating a read model in Cassandra.

The envelope handler function can be stateful, with variables and mutable data structures.
It is invoked by the `Projection` machinery one envelope at a time and visibility
guarantees between the invocations are handled automatically, i.e. no volatile or
other concurrency primitives are needed for managing the state.

Source[CassandraProjection.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-cassandra/src/main/scala/akka/projection/cassandra/scaladsl/CassandraProjection.scala#L40)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CassandraProjection
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#atLeastOnce[Offset,Envelope](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.scaladsl.SourceProvider[Offset,Envelope],handler:()=>akka.projection.scaladsl.Handler[Envelope]):akka.projection.scaladsl.AtLeastOnceProjection[Offset,Envelope] "Permalink")  def atLeastOnce\[Offset, Envelope](projectionId: [ProjectionId](../../ProjectionId.html), sourceProvider: [SourceProvider](../../scaladsl/SourceProvider.html)\[Offset, Envelope], handler: () \=\> [Handler](../../scaladsl/Handler.html)\[Envelope]): [AtLeastOnceProjection](../../scaladsl/AtLeastOnceProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../../Projection.html) with at\-least\-once processing semantics.

Create a [akka.projection.Projection](../../Projection.html) with at\-least\-once processing semantics. It stores the offset in Cassandra
after the `handler` has processed the envelope. This means that if the projection is restarted
from previously stored offset some envelopes may be processed more than once.

The offset is stored after a time window, or limited by a number of envelopes, whatever happens first.
This window can be defined with AtLeastOnceProjection.withSaveOffset of the returned
`AtLeastOnceCassandraProjection`. The default settings for the window is defined in configuration
section `akka.projection.at-least-once`.
6. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#atLeastOnceFlow[Offset,Envelope](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.scaladsl.SourceProvider[Offset,Envelope],handler:akka.stream.scaladsl.FlowWithContext[Envelope,akka.projection.ProjectionContext,akka.Done,akka.projection.ProjectionContext,_]):akka.projection.scaladsl.AtLeastOnceFlowProjection[Offset,Envelope] "Permalink")  def atLeastOnceFlow\[Offset, Envelope](projectionId: [ProjectionId](../../ProjectionId.html), sourceProvider: [SourceProvider](../../scaladsl/SourceProvider.html)\[Offset, Envelope], handler: [FlowWithContext](https://doc.akka.io/api/akka-core/2.10.13/akka/stream/scaladsl/FlowWithContext.html#akka.stream.scaladsl.FlowWithContext)\[Envelope, [ProjectionContext](../../ProjectionContext.html), [Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done), [ProjectionContext](../../ProjectionContext.html), \_]): [AtLeastOnceFlowProjection](../../scaladsl/AtLeastOnceFlowProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../../Projection.html) with a FlowWithContext as the envelope handler.

Create a [akka.projection.Projection](../../Projection.html) with a FlowWithContext as the envelope handler. It has at\-least\-once processing
semantics.

The flow should emit a `Done` element for each completed envelope. The offset of the envelope is carried
in the context of the `FlowWithContext` and is stored in Cassandra when corresponding `Done` is emitted.
Since the offset is stored after processing the envelope it means that if the
projection is restarted from previously stored offset then some envelopes may be processed more than once.

If the flow filters out envelopes the corresponding offset will not be stored, and such envelope
will be processed again if the projection is restarted and no later offset was stored.

The flow should not duplicate emitted envelopes (`mapConcat`) with same offset, because then it can result in
that the first offset is stored and when the projection is restarted that offset is considered completed even
though more of the duplicated envelopes were never processed.

The flow must not reorder elements, because the offsets may be stored in the wrong order and
and when the projection is restarted all envelopes up to the latest stored offset are considered
completed even though some of them may not have been processed. This is the reason the flow is
restricted to `FlowWithContext` rather than ordinary `Flow`.
7. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#atMostOnce[Offset,Envelope](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.scaladsl.SourceProvider[Offset,Envelope],handler:()=>akka.projection.scaladsl.Handler[Envelope]):akka.projection.scaladsl.AtMostOnceProjection[Offset,Envelope] "Permalink")  def atMostOnce\[Offset, Envelope](projectionId: [ProjectionId](../../ProjectionId.html), sourceProvider: [SourceProvider](../../scaladsl/SourceProvider.html)\[Offset, Envelope], handler: () \=\> [Handler](../../scaladsl/Handler.html)\[Envelope]): [AtMostOnceProjection](../../scaladsl/AtMostOnceProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../../Projection.html) with at\-most\-once processing semantics.

Create a [akka.projection.Projection](../../Projection.html) with at\-most\-once processing semantics. It stores the offset in Cassandra
before the `handler` has processed the envelope. This means that if the projection is restarted
from previously stored offset one envelope may not have been processed.
8. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
9. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#createTablesIfNotExists()(implicitsystem:akka.actor.typed.ActorSystem[_]):scala.concurrent.Future[akka.Done] "Permalink")  def createTablesIfNotExists()(implicit system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]For testing purposes the projection offset and management tables can be created programmatically.

For testing purposes the projection offset and management tables can be created programmatically.
For production it's recommended to create the table with DDL statements
before the system is started.
10. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#groupedWithin[Offset,Envelope](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.scaladsl.SourceProvider[Offset,Envelope],handler:()=>akka.projection.scaladsl.Handler[Seq[Envelope]]):akka.projection.scaladsl.GroupedProjection[Offset,Envelope] "Permalink")  def groupedWithin\[Offset, Envelope](projectionId: [ProjectionId](../../ProjectionId.html), sourceProvider: [SourceProvider](../../scaladsl/SourceProvider.html)\[Offset, Envelope], handler: () \=\> [Handler](../../scaladsl/Handler.html)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Envelope]]): [GroupedProjection](../../scaladsl/GroupedProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../../Projection.html) that groups envelopes and calls the `handler` with a group of `Envelopes`.

Create a [akka.projection.Projection](../../Projection.html) that groups envelopes and calls the `handler` with a group of `Envelopes`.
The envelopes are grouped within a time window, or limited by a number of envelopes,
whatever happens first. This window can be defined with GroupedProjection.withGroup of
the returned `GroupedCassandraProjection`. The default settings for the window is defined in configuration
section `akka.projection.grouped`.

It stores the offset in Cassandra immediately after the `handler` has processed the envelopes, but that
is still with at\-least\-once processing semantics. This means that if the projection is restarted
from previously stored offset the previous group of envelopes may be processed more than once.
14. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
15. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
18. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
19. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#createOffsetTableIfNotExists()(implicitsystem:akka.actor.typed.ActorSystem[_]):scala.concurrent.Future[akka.Done] "Permalink")  def createOffsetTableIfNotExists()(implicit system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]Annotations@deprecated Deprecated*(Since version 1\.2\.0\)* Renamed to createTablesIfNotExists
2. [**](../../../../akka/projection/cassandra/scaladsl/CassandraProjection$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/Projection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionContext.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionId.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/scaladsl/CassandraProjection$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/AtLeastOnceFlowProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/AtLeastOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/AtMostOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/GroupedProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/scaladsl/CassandraProjection$.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/scaladsl/CassandraProjection$.html)*