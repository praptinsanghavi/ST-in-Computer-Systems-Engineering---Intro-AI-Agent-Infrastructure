---
description: Akka Projection 1.6.20 - akka.projection.r2dbc.javadsl.R2dbcProjection
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcProjection$.html
title: Akka Projection 1.6.20 - akka.projection.r2dbc.javadsl.R2dbcProjection
---

# Akka Projection 1.6.20 - akka.projection.r2dbc.javadsl.R2dbcProjection

> **Summary:** Akka Projection 1.6.20 - akka.projection.r2dbc.javadsl.R2dbcProjection

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/projection/index.html "Permalink")  package [projection](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/projection/r2dbc/index.html "Permalink")  package [r2dbc](../index.html)Definition Classes[projection](../../index.html)
- [**](../../../../akka/projection/r2dbc/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[r2dbc](../index.html)
- [R2dbcHandler](R2dbcHandler.html "Implement this interface for the Envelope handler for R2DBC Projections.")
- R2dbcProjection
- [R2dbcReplication](R2dbcReplication$.html)
- [R2dbcSession](R2dbcSession.html)
o[akka](../../../index.html).[projection](../../index.html).[r2dbc](../index.html).[javadsl](index.html)

# R2dbcProjection[**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html "Permalink")

### 

#### object R2dbcProjection

Annotations@ApiMayChange() Source[R2dbcProjection.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-r2dbc/src/main/scala/akka/projection/r2dbc/javadsl/R2dbcProjection.scala#L31)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. R2dbcProjection
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#atLeastOnce[Offset,Envelope](projectionId:akka.projection.ProjectionId,settings:java.util.Optional[akka.projection.r2dbc.R2dbcProjectionSettings],sourceProvider:akka.projection.javadsl.SourceProvider[Offset,Envelope],handler:java.util.function.Supplier[akka.projection.r2dbc.javadsl.R2dbcHandler[Envelope]],system:akka.actor.typed.ActorSystem[_]):akka.projection.javadsl.AtLeastOnceProjection[Offset,Envelope] "Permalink")  def atLeastOnce\[Offset, Envelope](projectionId: [ProjectionId](../../ProjectionId.html), settings: [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[[R2dbcProjectionSettings](../R2dbcProjectionSettings.html)], sourceProvider: [SourceProvider](../../javadsl/SourceProvider.html)\[Offset, Envelope], handler: [Supplier](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[R2dbcHandler](R2dbcHandler.html)\[Envelope]], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [AtLeastOnceProjection](../../javadsl/AtLeastOnceProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../../Projection.html) with at\-least\-once processing semantics.

Create a [akka.projection.Projection](../../Projection.html) with at\-least\-once processing semantics.

It stores the offset in a relational database table using R2DBC after the `handler` has processed the envelope.
This means that if the projection is restarted from previously stored offset then some elements may be processed
more than once.

The [R2dbcHandler.process](R2dbcHandler.html#process(session:akka.projection.r2dbc.javadsl.R2dbcSession,envelope:Envelope):java.util.concurrent.CompletionStage[akka.Done]) in `handler` will be wrapped in a transaction. The transaction will be committed after
invoking [R2dbcHandler.process](R2dbcHandler.html#process(session:akka.projection.r2dbc.javadsl.R2dbcSession,envelope:Envelope):java.util.concurrent.CompletionStage[akka.Done]).

The offset is stored after a time window, or limited by a number of envelopes, whatever happens first. This window
can be defined with AtLeastOnceProjection.withSaveOffset of the returned `AtLeastOnceProjection`. The default
settings for the window is defined in configuration section `akka.projection.at-least-once`.
6. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#atLeastOnceAsync[Offset,Envelope](projectionId:akka.projection.ProjectionId,settings:java.util.Optional[akka.projection.r2dbc.R2dbcProjectionSettings],sourceProvider:akka.projection.javadsl.SourceProvider[Offset,Envelope],handler:java.util.function.Supplier[akka.projection.javadsl.Handler[Envelope]],system:akka.actor.typed.ActorSystem[_]):akka.projection.javadsl.AtLeastOnceProjection[Offset,Envelope] "Permalink")  def atLeastOnceAsync\[Offset, Envelope](projectionId: [ProjectionId](../../ProjectionId.html), settings: [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[[R2dbcProjectionSettings](../R2dbcProjectionSettings.html)], sourceProvider: [SourceProvider](../../javadsl/SourceProvider.html)\[Offset, Envelope], handler: [Supplier](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Handler](../../javadsl/Handler.html)\[Envelope]], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [AtLeastOnceProjection](../../javadsl/AtLeastOnceProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../../Projection.html) with at\-least\-once processing semantics.

Create a [akka.projection.Projection](../../Projection.html) with at\-least\-once processing semantics.

Compared to [R2dbcProjection.atLeastOnce](#atLeastOnce[Offset,Envelope](projectionId:akka.projection.ProjectionId,settings:java.util.Optional[akka.projection.r2dbc.R2dbcProjectionSettings],sourceProvider:akka.projection.javadsl.SourceProvider[Offset,Envelope],handler:java.util.function.Supplier[akka.projection.r2dbc.javadsl.R2dbcHandler[Envelope]],system:akka.actor.typed.ActorSystem[_]):akka.projection.javadsl.AtLeastOnceProjection[Offset,Envelope]) the Handler is not storing the projected result in the database,
but is integrating with something else.

It stores the offset in a relational database table using R2DBC after the `handler` has processed the envelope.
This means that if the projection is restarted from previously stored offset then some elements may be processed
more than once.

The offset is stored after a time window, or limited by a number of envelopes, whatever happens first. This window
can be defined with AtLeastOnceProjection.withSaveOffset of the returned `AtLeastOnceProjection`. The default
settings for the window is defined in configuration section `akka.projection.at-least-once`.
7. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#atLeastOnceFlow[Offset,Envelope](projectionId:akka.projection.ProjectionId,settings:java.util.Optional[akka.projection.r2dbc.R2dbcProjectionSettings],sourceProvider:akka.projection.javadsl.SourceProvider[Offset,Envelope],handler:akka.stream.javadsl.FlowWithContext[Envelope,akka.projection.ProjectionContext,akka.Done,akka.projection.ProjectionContext,_],system:akka.actor.typed.ActorSystem[_]):akka.projection.javadsl.AtLeastOnceFlowProjection[Offset,Envelope] "Permalink")  def atLeastOnceFlow\[Offset, Envelope](projectionId: [ProjectionId](../../ProjectionId.html), settings: [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[[R2dbcProjectionSettings](../R2dbcProjectionSettings.html)], sourceProvider: [SourceProvider](../../javadsl/SourceProvider.html)\[Offset, Envelope], handler: [FlowWithContext](https://doc.akka.io/api/akka-core/2.10.13/akka/stream/javadsl/FlowWithContext.html#akka.stream.javadsl.FlowWithContext)\[Envelope, [ProjectionContext](../../ProjectionContext.html), [Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done), [ProjectionContext](../../ProjectionContext.html), \_], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [AtLeastOnceFlowProjection](../../javadsl/AtLeastOnceFlowProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../../Projection.html) with a FlowWithContext as the envelope handler.

Create a [akka.projection.Projection](../../Projection.html) with a FlowWithContext as the envelope handler. It has at\-least\-once
processing semantics.

The flow should emit a `Done` element for each completed envelope. The offset of the envelope is carried in the
context of the `FlowWithContext` and is stored in the database when corresponding `Done` is emitted. Since the
offset is stored after processing the envelope it means that if the projection is restarted from previously stored
offset then some envelopes may be processed more than once.

If the flow filters out envelopes the corresponding offset will not be stored, and such envelope will be processed
again if the projection is restarted and no later offset was stored.

The flow should not duplicate emitted envelopes (`mapConcat`) with same offset, because then it can result in that
the first offset is stored and when the projection is restarted that offset is considered completed even though
more of the duplicated envelopes were never processed.

The flow must not reorder elements, because the offsets may be stored in the wrong order and when the
projection is restarted all envelopes up to the latest stored offset are considered completed even though some of
them may not have been processed. This is the reason the flow is restricted to `FlowWithContext` rather than
ordinary `Flow`.
8. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
9. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#exactlyOnce[Offset,Envelope](projectionId:akka.projection.ProjectionId,settings:java.util.Optional[akka.projection.r2dbc.R2dbcProjectionSettings],sourceProvider:akka.projection.javadsl.SourceProvider[Offset,Envelope],handler:java.util.function.Supplier[akka.projection.r2dbc.javadsl.R2dbcHandler[Envelope]],system:akka.actor.typed.ActorSystem[_]):akka.projection.javadsl.ExactlyOnceProjection[Offset,Envelope] "Permalink")  def exactlyOnce\[Offset, Envelope](projectionId: [ProjectionId](../../ProjectionId.html), settings: [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[[R2dbcProjectionSettings](../R2dbcProjectionSettings.html)], sourceProvider: [SourceProvider](../../javadsl/SourceProvider.html)\[Offset, Envelope], handler: [Supplier](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[R2dbcHandler](R2dbcHandler.html)\[Envelope]], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [ExactlyOnceProjection](../../javadsl/ExactlyOnceProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../../Projection.html) with exactly\-once processing semantics.

Create a [akka.projection.Projection](../../Projection.html) with exactly\-once processing semantics.

It stores the offset in a relational database table using R2DBC in the same transaction as the user defined
`handler`.
12. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
13. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#groupedWithin[Offset,Envelope](projectionId:akka.projection.ProjectionId,settings:java.util.Optional[akka.projection.r2dbc.R2dbcProjectionSettings],sourceProvider:akka.projection.javadsl.SourceProvider[Offset,Envelope],handler:java.util.function.Supplier[akka.projection.r2dbc.javadsl.R2dbcHandler[java.util.List[Envelope]]],system:akka.actor.typed.ActorSystem[_]):akka.projection.javadsl.GroupedProjection[Offset,Envelope] "Permalink")  def groupedWithin\[Offset, Envelope](projectionId: [ProjectionId](../../ProjectionId.html), settings: [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[[R2dbcProjectionSettings](../R2dbcProjectionSettings.html)], sourceProvider: [SourceProvider](../../javadsl/SourceProvider.html)\[Offset, Envelope], handler: [Supplier](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[R2dbcHandler](R2dbcHandler.html)\[[List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[Envelope]]], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [GroupedProjection](../../javadsl/GroupedProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../../Projection.html) that groups envelopes and calls the `handler` with a group of `Envelopes`.

Create a [akka.projection.Projection](../../Projection.html) that groups envelopes and calls the `handler` with a group of `Envelopes`.
The envelopes are grouped within a time window, or limited by a number of envelopes, whatever happens first. This
window can be defined with GroupedProjection.withGroup of the returned `GroupedProjection`. The default
settings for the window is defined in configuration section `akka.projection.grouped`.

It stores the offset in a relational database table using R2DBC in the same transaction as the user defined
`handler`.
14. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#groupedWithinAsync[Offset,Envelope](projectionId:akka.projection.ProjectionId,settings:java.util.Optional[akka.projection.r2dbc.R2dbcProjectionSettings],sourceProvider:akka.projection.javadsl.SourceProvider[Offset,Envelope],handler:java.util.function.Supplier[akka.projection.javadsl.Handler[java.util.List[Envelope]]],system:akka.actor.typed.ActorSystem[_]):akka.projection.javadsl.GroupedProjection[Offset,Envelope] "Permalink")  def groupedWithinAsync\[Offset, Envelope](projectionId: [ProjectionId](../../ProjectionId.html), settings: [Optional](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/Optional.html#java.util.Optional)\[[R2dbcProjectionSettings](../R2dbcProjectionSettings.html)], sourceProvider: [SourceProvider](../../javadsl/SourceProvider.html)\[Offset, Envelope], handler: [Supplier](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[Handler](../../javadsl/Handler.html)\[[List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/List.html#java.util.List)\[Envelope]]], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [GroupedProjection](../../javadsl/GroupedProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../../Projection.html) that groups envelopes and calls the `handler` with a group of `Envelopes`.

Create a [akka.projection.Projection](../../Projection.html) that groups envelopes and calls the `handler` with a group of `Envelopes`.
The envelopes are grouped within a time window, or limited by a number of envelopes, whatever happens first. This
window can be defined with GroupedProjection.withGroup of the returned `GroupedProjection`. The default
settings for the window is defined in configuration section `akka.projection.grouped`.

Compared to [R2dbcProjection.groupedWithin](#groupedWithin[Offset,Envelope](projectionId:akka.projection.ProjectionId,settings:java.util.Optional[akka.projection.r2dbc.R2dbcProjectionSettings],sourceProvider:akka.projection.javadsl.SourceProvider[Offset,Envelope],handler:java.util.function.Supplier[akka.projection.r2dbc.javadsl.R2dbcHandler[java.util.List[Envelope]]],system:akka.actor.typed.ActorSystem[_]):akka.projection.javadsl.GroupedProjection[Offset,Envelope]) the Handler is not storing the projected result in the database,
but is integrating with something else.

It stores the offset in a relational database table using R2DBC immediately after the `handler` has processed the
envelopes, but that is still with at\-least\-once processing semantics. This means that if the projection is
restarted from previously stored offset the previous group of envelopes may be processed more than once.
15. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
16. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
19. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
20. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../akka/projection/r2dbc/javadsl/R2dbcProjection$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/AtLeastOnceFlowProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/AtLeastOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/ExactlyOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/GroupedProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/R2dbcProjectionSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcHandler$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcProjection$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcReplication$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcSession$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcSession.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcProjection$.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/r2dbc/javadsl/R2dbcProjection$.html)*