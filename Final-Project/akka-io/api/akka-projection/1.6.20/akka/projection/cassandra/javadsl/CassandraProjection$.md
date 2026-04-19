---
description: Akka Projection 1.6.20 - akka.projection.cassandra.javadsl.CassandraProjection
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/javadsl/CassandraProjection$.html
title: Akka Projection 1.6.20 - akka.projection.cassandra.javadsl.CassandraProjection
---

# Akka Projection 1.6.20 - akka.projection.cassandra.javadsl.CassandraProjection

> **Summary:** Akka Projection 1.6.20 - akka.projection.cassandra.javadsl.CassandraProjection

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/projection/index.html "Permalink")  package [projection](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/projection/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[projection](../../index.html)
- [**](../../../../akka/projection/cassandra/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[cassandra](../index.html)
- CassandraProjection
o[akka](../../../index.html).[projection](../../index.html).[cassandra](../index.html).[javadsl](index.html)

# CassandraProjection[**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html "Permalink")

### 

#### object CassandraProjection

Factories of [akka.projection.Projection](../../Projection.html) where the offset is stored in Cassandra. The envelope handler can
integrate with anything, such as publishing to a message broker, or updating a read model in Cassandra.

Source[CassandraProjection.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-cassandra/src/main/scala/akka/projection/cassandra/javadsl/CassandraProjection.scala#L37)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#atLeastOnce[Offset,Envelope](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.javadsl.SourceProvider[Offset,Envelope],handler:java.util.function.Supplier[akka.projection.javadsl.Handler[Envelope]]):akka.projection.javadsl.AtLeastOnceProjection[Offset,Envelope] "Permalink")  def atLeastOnce\[Offset, Envelope](projectionId: [ProjectionId](../../ProjectionId.html), sourceProvider: [SourceProvider](../../javadsl/SourceProvider.html)\[Offset, Envelope], handler: [Supplier](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Handler](../../javadsl/Handler.html)\[Envelope]]): [AtLeastOnceProjection](../../javadsl/AtLeastOnceProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../../Projection.html) with at\-least\-once processing semantics.

Create a [akka.projection.Projection](../../Projection.html) with at\-least\-once processing semantics. It stores the offset in Cassandra
after the `handler` has processed the envelope. This means that if the projection is restarted
from previously stored offset some elements may be processed more than once.

The offset is stored after a time window, or limited by a number of envelopes, whatever happens first.
This window can be defined with AtLeastOnceProjection.withSaveOffset of the returned
`AtLeastOnceCassandraProjection`. The default settings for the window is defined in configuration
section `akka.projection.at-least-once`.
6. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#atLeastOnceFlow[Offset,Envelope](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.javadsl.SourceProvider[Offset,Envelope],handler:akka.stream.javadsl.FlowWithContext[Envelope,akka.projection.ProjectionContext,akka.Done,akka.projection.ProjectionContext,_]):akka.projection.javadsl.AtLeastOnceFlowProjection[Offset,Envelope] "Permalink")  def atLeastOnceFlow\[Offset, Envelope](projectionId: [ProjectionId](../../ProjectionId.html), sourceProvider: [SourceProvider](../../javadsl/SourceProvider.html)\[Offset, Envelope], handler: [FlowWithContext](https://doc.akka.io/api/akka-core/2.10.13/akka/stream/javadsl/FlowWithContext.html#akka.stream.javadsl.FlowWithContext)\[Envelope, [ProjectionContext](../../ProjectionContext.html), [Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done), [ProjectionContext](../../ProjectionContext.html), \_]): [AtLeastOnceFlowProjection](../../javadsl/AtLeastOnceFlowProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../../Projection.html) with a FlowWithContext as the envelope handler.

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
7. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#atMostOnce[Offset,Envelope](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.javadsl.SourceProvider[Offset,Envelope],handler:java.util.function.Supplier[akka.projection.javadsl.Handler[Envelope]]):akka.projection.javadsl.AtMostOnceProjection[Offset,Envelope] "Permalink")  def atMostOnce\[Offset, Envelope](projectionId: [ProjectionId](../../ProjectionId.html), sourceProvider: [SourceProvider](../../javadsl/SourceProvider.html)\[Offset, Envelope], handler: [Supplier](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Handler](../../javadsl/Handler.html)\[Envelope]]): [AtMostOnceProjection](../../javadsl/AtMostOnceProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../../Projection.html) with at\-most\-once processing semantics.

Create a [akka.projection.Projection](../../Projection.html) with at\-most\-once processing semantics. It stores the offset in Cassandra
before the `handler` has processed the envelope. This means that if the projection is restarted
from previously stored offset one envelope may not have been processed.
8. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
9. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#createTablesIfNotExists(system:akka.actor.typed.ActorSystem[_]):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def createTablesIfNotExists(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]For testing purposes the projection offset and management tables can be created programmatically.

For testing purposes the projection offset and management tables can be created programmatically.
For production it's recommended to create the table with DDL statements
before the system is started.
10. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
12. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#groupedWithin[Offset,Envelope](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.javadsl.SourceProvider[Offset,Envelope],handler:java.util.function.Supplier[akka.projection.javadsl.Handler[java.util.List[Envelope]]]):akka.projection.javadsl.GroupedProjection[Offset,Envelope] "Permalink")  def groupedWithin\[Offset, Envelope](projectionId: [ProjectionId](../../ProjectionId.html), sourceProvider: [SourceProvider](../../javadsl/SourceProvider.html)\[Offset, Envelope], handler: [Supplier](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Handler](../../javadsl/Handler.html)\[[List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[Envelope]]]): [GroupedProjection](../../javadsl/GroupedProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../../Projection.html) that groups envelopes and calls the `handler` with a group of `Envelopes`.

Create a [akka.projection.Projection](../../Projection.html) that groups envelopes and calls the `handler` with a group of `Envelopes`.
The envelopes are grouped within a time window, or limited by a number of envelopes,
whatever happens first. This window can be defined with GroupedProjection.withGroup of
the returned `GroupedCassandraProjection`. The default settings for the window is defined in configuration
section `akka.projection.grouped`.

It stores the offset in Cassandra immediately after the `handler` has processed the envelopes, but that
is still with at\-least\-once processing semantics. This means that if the projection is restarted
from previously stored offset the previous group of envelopes may be processed more than once.
14. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
15. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
18. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
19. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#createOffsetTableIfNotExists(system:akka.actor.typed.ActorSystem[_]):java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def createOffsetTableIfNotExists(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]Annotations@deprecated Deprecated*(Since version 1\.2\.0\)* Renamed to createTablesIfNotExists
2. [**](../../../../akka/projection/cassandra/javadsl/CassandraProjection$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/Projection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionContext.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionId.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/javadsl/CassandraProjection$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/AtLeastOnceFlowProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/AtLeastOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/AtMostOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/GroupedProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/javadsl/CassandraProjection$.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/javadsl/CassandraProjection$.html)*