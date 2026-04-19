---
description: Akka Projection 1.6.20 - akka.projection.slick.SlickProjection
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/slick/SlickProjection$.html
title: Akka Projection 1.6.20 - akka.projection.slick.SlickProjection
---

# Akka Projection 1.6.20 - akka.projection.slick.SlickProjection

> **Summary:** Akka Projection 1.6.20 - akka.projection.slick.SlickProjection

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/projection/index.html "Permalink")  package [projection](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/projection/slick/index.html "Permalink")  package [slick](index.html)Definition Classes[projection](../index.html)
- [SlickHandler](SlickHandler.html "Implement this interface for the Envelope handler in SlickProjection.")
- SlickProjection
o[akka](../../index.html).[projection](../index.html).[slick](index.html)

# SlickProjection[**](../../../akka/projection/slick/SlickProjection$.html "Permalink")

### 

#### object SlickProjection

Factories of [akka.projection.Projection](../Projection.html) where the offset is stored in a relational database table using Slick.
The envelope handler can integrate with anything, such as publishing to a message broker, or updating a relational read model.

Source[SlickProjection.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-slick/src/main/scala/akka/projection/slick/SlickProjection.scala#L48)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SlickProjection
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/projection/slick/SlickProjection$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/projection/slick/SlickProjection$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/projection/slick/SlickProjection$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/projection/slick/SlickProjection$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/projection/slick/SlickProjection$.html#atLeastOnce[Offset,Envelope,P<:slick.jdbc.JdbcProfile](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.scaladsl.SourceProvider[Offset,Envelope],databaseConfig:slick.basic.DatabaseConfig[P],handler:()=>akka.projection.slick.SlickHandler[Envelope])(implicitevidence$2:scala.reflect.ClassTag[P],implicitsystem:akka.actor.typed.ActorSystem[_]):akka.projection.scaladsl.AtLeastOnceProjection[Offset,Envelope] "Permalink")  def atLeastOnce\[Offset, Envelope, P \<: JdbcProfile](projectionId: [ProjectionId](../ProjectionId.html), sourceProvider: [SourceProvider](../scaladsl/SourceProvider.html)\[Offset, Envelope], databaseConfig: DatabaseConfig\[P], handler: () \=\> [SlickHandler](SlickHandler.html)\[Envelope])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[P], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [AtLeastOnceProjection](../scaladsl/AtLeastOnceProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../Projection.html) with at\-least\-once processing semantics.

Create a [akka.projection.Projection](../Projection.html) with at\-least\-once processing semantics.

The DBIO returned by the SlickHandler.process() of the provided handler will be
wrapped in a transaction.

It stores the offset in a relational database table using Slick after the `handler` has processed the envelope.
This means that if the projection is restarted from previously stored offset then some elements may be processed
more than once.

The offset is stored after a time window, or limited by a number of envelopes, whatever happens first.
This window can be defined with AtLeastOnceProjection.withSaveOffset of the returned
`AtLeastOnceProjection`. The default settings for the window is defined in configuration
section `akka.projection.at-least-once`.
6. [**](../../../akka/projection/slick/SlickProjection$.html#atLeastOnceAsync[Offset,Envelope,P<:slick.jdbc.JdbcProfile](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.scaladsl.SourceProvider[Offset,Envelope],databaseConfig:slick.basic.DatabaseConfig[P],handler:()=>akka.projection.scaladsl.Handler[Envelope])(implicitevidence$3:scala.reflect.ClassTag[P],implicitsystem:akka.actor.typed.ActorSystem[_]):akka.projection.scaladsl.AtLeastOnceProjection[Offset,Envelope] "Permalink")  def atLeastOnceAsync\[Offset, Envelope, P \<: JdbcProfile](projectionId: [ProjectionId](../ProjectionId.html), sourceProvider: [SourceProvider](../scaladsl/SourceProvider.html)\[Offset, Envelope], databaseConfig: DatabaseConfig\[P], handler: () \=\> [Handler](../scaladsl/Handler.html)\[Envelope])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[P], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [AtLeastOnceProjection](../scaladsl/AtLeastOnceProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../Projection.html) with at\-least\-once processing semantics.

Create a [akka.projection.Projection](../Projection.html) with at\-least\-once processing semantics.

Compared to [SlickProjection.atLeastOnce](#atLeastOnce[Offset,Envelope,P<:slick.jdbc.JdbcProfile](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.scaladsl.SourceProvider[Offset,Envelope],databaseConfig:slick.basic.DatabaseConfig[P],handler:()=>akka.projection.slick.SlickHandler[Envelope])(implicitevidence$2:scala.reflect.ClassTag[P],implicitsystem:akka.actor.typed.ActorSystem[_]):akka.projection.scaladsl.AtLeastOnceProjection[Offset,Envelope]) the Handler is not storing the projected result in the
database, but is integrating with something else.

It stores the offset in a relational database table using Slick after the `handler` has processed the envelope.
This means that if the projection is restarted from previously stored offset then some elements may be processed
more than once.

The offset is stored after a time window, or limited by a number of envelopes, whatever happens first.
This window can be defined with AtLeastOnceProjection.withSaveOffset of the returned
`AtLeastOnceProjection`. The default settings for the window is defined in configuration
section `akka.projection.at-least-once`.
7. [**](../../../akka/projection/slick/SlickProjection$.html#atLeastOnceFlow[Offset,Envelope,P<:slick.jdbc.JdbcProfile](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.scaladsl.SourceProvider[Offset,Envelope],databaseConfig:slick.basic.DatabaseConfig[P],handler:akka.stream.scaladsl.FlowWithContext[Envelope,akka.projection.ProjectionContext,akka.Done,akka.projection.ProjectionContext,_])(implicitevidence$6:scala.reflect.ClassTag[P],implicitsystem:akka.actor.typed.ActorSystem[_]):akka.projection.scaladsl.AtLeastOnceFlowProjection[Offset,Envelope] "Permalink")  def atLeastOnceFlow\[Offset, Envelope, P \<: JdbcProfile](projectionId: [ProjectionId](../ProjectionId.html), sourceProvider: [SourceProvider](../scaladsl/SourceProvider.html)\[Offset, Envelope], databaseConfig: DatabaseConfig\[P], handler: [FlowWithContext](https://doc.akka.io/api/akka-core/2.10.13/akka/stream/scaladsl/FlowWithContext.html#akka.stream.scaladsl.FlowWithContext)\[Envelope, [ProjectionContext](../ProjectionContext.html), [Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done), [ProjectionContext](../ProjectionContext.html), \_])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[P], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [AtLeastOnceFlowProjection](../scaladsl/AtLeastOnceFlowProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../Projection.html) with a FlowWithContext as the envelope handler.

Create a [akka.projection.Projection](../Projection.html) with a FlowWithContext as the envelope handler. It has at\-least\-once processing
semantics.

The flow should emit a `Done` element for each completed envelope. The offset of the envelope is carried
in the context of the `FlowWithContext` and is stored in the database when corresponding `Done` is emitted.
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
8. [**](../../../akka/projection/slick/SlickProjection$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
9. [**](../../../akka/projection/slick/SlickProjection$.html#createTablesIfNotExists[P<:slick.jdbc.JdbcProfile](databaseConfig:slick.basic.DatabaseConfig[P])(implicitevidence$7:scala.reflect.ClassTag[P],implicitsystem:akka.actor.typed.ActorSystem[_]):scala.concurrent.Future[akka.Done] "Permalink")  def createTablesIfNotExists\[P \<: JdbcProfile](databaseConfig: DatabaseConfig\[P])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[P], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]For testing purposes the projection offset and management tables can be created programmatically.

For testing purposes the projection offset and management tables can be created programmatically.
For production it's recommended to create the table with DDL statements
before the system is started.
10. [**](../../../akka/projection/slick/SlickProjection$.html#dropTablesIfExists[P<:slick.jdbc.JdbcProfile](databaseConfig:slick.basic.DatabaseConfig[P])(implicitevidence$9:scala.reflect.ClassTag[P],implicitsystem:akka.actor.typed.ActorSystem[_]):scala.concurrent.Future[akka.Done] "Permalink")  def dropTablesIfExists\[P \<: JdbcProfile](databaseConfig: DatabaseConfig\[P])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[P], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]For testing purposes the projection offset and management tables can be dropped programmatically.
11. [**](../../../akka/projection/slick/SlickProjection$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/projection/slick/SlickProjection$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
13. [**](../../../akka/projection/slick/SlickProjection$.html#exactlyOnce[Offset,Envelope,P<:slick.jdbc.JdbcProfile](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.scaladsl.SourceProvider[Offset,Envelope],databaseConfig:slick.basic.DatabaseConfig[P],handler:()=>akka.projection.slick.SlickHandler[Envelope])(implicitevidence$1:scala.reflect.ClassTag[P],implicitsystem:akka.actor.typed.ActorSystem[_]):akka.projection.scaladsl.ExactlyOnceProjection[Offset,Envelope] "Permalink")  def exactlyOnce\[Offset, Envelope, P \<: JdbcProfile](projectionId: [ProjectionId](../ProjectionId.html), sourceProvider: [SourceProvider](../scaladsl/SourceProvider.html)\[Offset, Envelope], databaseConfig: DatabaseConfig\[P], handler: () \=\> [SlickHandler](SlickHandler.html)\[Envelope])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[P], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [ExactlyOnceProjection](../scaladsl/ExactlyOnceProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../Projection.html) with exactly\-once processing semantics.

Create a [akka.projection.Projection](../Projection.html) with exactly\-once processing semantics.

It stores the offset in a relational database table using Slick in the same transaction
as the DBIO returned from the `handler`.
14. [**](../../../akka/projection/slick/SlickProjection$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
15. [**](../../../akka/projection/slick/SlickProjection$.html#groupedWithin[Offset,Envelope,P<:slick.jdbc.JdbcProfile](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.scaladsl.SourceProvider[Offset,Envelope],databaseConfig:slick.basic.DatabaseConfig[P],handler:()=>akka.projection.slick.SlickHandler[Seq[Envelope]])(implicitevidence$4:scala.reflect.ClassTag[P],implicitsystem:akka.actor.typed.ActorSystem[_]):akka.projection.scaladsl.GroupedProjection[Offset,Envelope] "Permalink")  def groupedWithin\[Offset, Envelope, P \<: JdbcProfile](projectionId: [ProjectionId](../ProjectionId.html), sourceProvider: [SourceProvider](../scaladsl/SourceProvider.html)\[Offset, Envelope], databaseConfig: DatabaseConfig\[P], handler: () \=\> [SlickHandler](SlickHandler.html)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Envelope]])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[P], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [GroupedProjection](../scaladsl/GroupedProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../Projection.html) that groups envelopes and calls the `handler` with a group of `Envelopes`.

Create a [akka.projection.Projection](../Projection.html) that groups envelopes and calls the `handler` with a group of `Envelopes`.
The envelopes are grouped within a time window, or limited by a number of envelopes,
whatever happens first. This window can be defined with GroupedProjection.withGroup of
the returned `GroupedProjection`. The default settings for the window is defined in configuration
section `akka.projection.grouped`.

It stores the offset in a relational database table using Slick in the same transaction
as the DBIO returned from the `handler`.
16. [**](../../../akka/projection/slick/SlickProjection$.html#groupedWithinAsync[Offset,Envelope,P<:slick.jdbc.JdbcProfile](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.scaladsl.SourceProvider[Offset,Envelope],databaseConfig:slick.basic.DatabaseConfig[P],handler:()=>akka.projection.scaladsl.Handler[Seq[Envelope]])(implicitevidence$5:scala.reflect.ClassTag[P],implicitsystem:akka.actor.typed.ActorSystem[_]):akka.projection.scaladsl.GroupedProjection[Offset,Envelope] "Permalink")  def groupedWithinAsync\[Offset, Envelope, P \<: JdbcProfile](projectionId: [ProjectionId](../ProjectionId.html), sourceProvider: [SourceProvider](../scaladsl/SourceProvider.html)\[Offset, Envelope], databaseConfig: DatabaseConfig\[P], handler: () \=\> [Handler](../scaladsl/Handler.html)\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Envelope]])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[P], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [GroupedProjection](../scaladsl/GroupedProjection.html)\[Offset, Envelope]Create a [akka.projection.Projection](../Projection.html) that groups envelopes and calls the `handler` with a group of `Envelopes`.

Create a [akka.projection.Projection](../Projection.html) that groups envelopes and calls the `handler` with a group of `Envelopes`.
The envelopes are grouped within a time window, or limited by a number of envelopes,
whatever happens first. This window can be defined with GroupedProjection.withGroup of
the returned `GroupedProjection`. The default settings for the window is defined in configuration
section `akka.projection.grouped`.

Compared to [SlickProjection.groupedWithin](#groupedWithin[Offset,Envelope,P<:slick.jdbc.JdbcProfile](projectionId:akka.projection.ProjectionId,sourceProvider:akka.projection.scaladsl.SourceProvider[Offset,Envelope],databaseConfig:slick.basic.DatabaseConfig[P],handler:()=>akka.projection.slick.SlickHandler[Seq[Envelope]])(implicitevidence$4:scala.reflect.ClassTag[P],implicitsystem:akka.actor.typed.ActorSystem[_]):akka.projection.scaladsl.GroupedProjection[Offset,Envelope]) the Handler is not storing the projected result in the
database, but is integrating with something else.

It stores the offset in a relational database table using Slick immediately after the `handler` has
processed the envelopes, but that is still with at\-least\-once processing semantics. This means that
if the projection is restarted from previously stored offset the previous group of envelopes may be
processed more than once.
17. [**](../../../akka/projection/slick/SlickProjection$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
18. [**](../../../akka/projection/slick/SlickProjection$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/projection/slick/SlickProjection$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/projection/slick/SlickProjection$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
21. [**](../../../akka/projection/slick/SlickProjection$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
22. [**](../../../akka/projection/slick/SlickProjection$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/projection/slick/SlickProjection$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/projection/slick/SlickProjection$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/projection/slick/SlickProjection$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
26. [**](../../../akka/projection/slick/SlickProjection$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/projection/slick/SlickProjection$.html#createOffsetTableIfNotExists[P<:slick.jdbc.JdbcProfile](databaseConfig:slick.basic.DatabaseConfig[P])(implicitevidence$8:scala.reflect.ClassTag[P],implicitsystem:akka.actor.typed.ActorSystem[_]):scala.concurrent.Future[akka.Done] "Permalink")  def createOffsetTableIfNotExists\[P \<: JdbcProfile](databaseConfig: DatabaseConfig\[P])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[P], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]Annotations@deprecated Deprecated*(Since version 1\.2\.0\)* Renamed to createTablesIfNotExists
2. [**](../../../akka/projection/slick/SlickProjection$.html#dropOffsetTableIfExists[P<:slick.jdbc.JdbcProfile](databaseConfig:slick.basic.DatabaseConfig[P])(implicitevidence$10:scala.reflect.ClassTag[P],implicitsystem:akka.actor.typed.ActorSystem[_]):scala.concurrent.Future[akka.Done] "Permalink")  def dropOffsetTableIfExists\[P \<: JdbcProfile](databaseConfig: DatabaseConfig\[P])(implicit arg0: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[P], system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]Annotations@deprecated Deprecated*(Since version 1\.2\.0\)* Renamed to dropTablesIfExists
3. [**](../../../akka/projection/slick/SlickProjection$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/AtLeastOnceFlowProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/AtLeastOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/ExactlyOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/GroupedProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/slick/SlickHandler$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/slick/SlickHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/slick/SlickProjection$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/slick/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/slick/SlickProjection$.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/slick/SlickProjection$.html)*