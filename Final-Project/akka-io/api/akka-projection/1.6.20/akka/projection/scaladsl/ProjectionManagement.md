---
description: Akka Projection 1.6.20 - akka.projection.scaladsl.ProjectionManagement
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:38:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/ProjectionManagement.html
title: Akka Projection 1.6.20 - akka.projection.scaladsl.ProjectionManagement
---

# Akka Projection 1.6.20 - akka.projection.scaladsl.ProjectionManagement

> **Summary:** Akka Projection 1.6.20 - akka.projection.scaladsl.ProjectionManagement

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/projection/index.html "Permalink")  package [projection](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/projection/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[projection](../index.html)
- [ActorHandler](ActorHandler.html "This Handler gives support for spawning an actor of a given Behavior to delegate processing of the envelopes to the actor.")
- [AtLeastOnceFlowProjection](AtLeastOnceFlowProjection.html)
- [AtLeastOnceProjection](AtLeastOnceProjection.html)
- [AtMostOnceProjection](AtMostOnceProjection.html)
- [ExactlyOnceProjection](ExactlyOnceProjection.html)
- [GroupedProjection](GroupedProjection.html)
- [Handler](Handler.html "Implement this interface for the Envelope handler in the Projection.")
- [HandlerLifecycle](HandlerLifecycle.html)
- [MergeableOffsetSourceProvider](MergeableOffsetSourceProvider.html)
- ProjectionManagement
- [SourceProvider](SourceProvider.html)
- [StatefulHandler](StatefulHandler.html)
- [VerifiableSourceProvider](VerifiableSourceProvider.html)
[c](ProjectionManagement$.html "See companion object")[akka](../../index.html).[projection](../index.html).[scaladsl](index.html)

# [ProjectionManagement](ProjectionManagement$.html "See companion object")[**](../../../akka/projection/scaladsl/ProjectionManagement.html "Permalink")

### Companion [object ProjectionManagement](ProjectionManagement$.html "See companion object")

#### class ProjectionManagement extends [Extension](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/Extension.html#akka.actor.typed.Extension)

Source[ProjectionManagement.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-core/src/main/scala/akka/projection/scaladsl/ProjectionManagement.scala#L33)Linear Supertypes[Extension](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/Extension.html#akka.actor.typed.Extension), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ProjectionManagement
2. Extension
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#<init>(system:akka.actor.typed.ActorSystem[_]):akka.projection.scaladsl.ProjectionManagement "Permalink")  new ProjectionManagement(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_])
### Value Members

1. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/projection/scaladsl/ProjectionManagement.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#clearOffset(projectionId:akka.projection.ProjectionId):scala.concurrent.Future[akka.Done] "Permalink")  def clearOffset(projectionId: [ProjectionId](../ProjectionId.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]Clear the stored offset for the `projectionId` and restart the `Projection`.

Clear the stored offset for the `projectionId` and restart the `Projection`.
This can be useful if the projection should be completely rebuilt, starting over again from the first
offset.
6. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
7. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#getOffset[Offset](projectionId:akka.projection.ProjectionId):scala.concurrent.Future[Option[Offset]] "Permalink")  def getOffset\[Offset](projectionId: [ProjectionId](../ProjectionId.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[Offset]]Get the latest stored offset for the `projectionId`.
11. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
12. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#isPaused(projectionId:akka.projection.ProjectionId):scala.concurrent.Future[Boolean] "Permalink")  def isPaused(projectionId: [ProjectionId](../ProjectionId.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]Is the given Projection paused or not?
14. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
16. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
17. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#pause(projectionId:akka.projection.ProjectionId):scala.concurrent.Future[akka.Done] "Permalink")  def pause(projectionId: [ProjectionId](../ProjectionId.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]Pause the given Projection.

Pause the given Projection. Processing will be stopped.
While the Projection is paused other management operations can be performed, such as
[ProjectionManagement.updateOffset](#updateOffset[Offset](projectionId:akka.projection.ProjectionId,offset:Offset):scala.concurrent.Future[akka.Done]).
The Projection can be resumed with [ProjectionManagement.resume](#resume(projectionId:akka.projection.ProjectionId):scala.concurrent.Future[akka.Done]).

The paused/resumed state is stored and, and it is read when the Projections are started, for example
in case of rebalance or system restart.
18. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#resume(projectionId:akka.projection.ProjectionId):scala.concurrent.Future[akka.Done] "Permalink")  def resume(projectionId: [ProjectionId](../ProjectionId.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]Resume a paused Projection.

Resume a paused Projection. Processing will be start from previously stored offset.

The paused/resumed state is stored and, and it is read when the Projections are started, for example
in case of rebalance or system restart.
19. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#updateOffset[Offset](projectionId:akka.projection.ProjectionId,offset:Offset):scala.concurrent.Future[akka.Done] "Permalink")  def updateOffset\[Offset](projectionId: [ProjectionId](../ProjectionId.html), offset: Offset): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]Update the stored offset for the `projectionId` and restart the `Projection`.

Update the stored offset for the `projectionId` and restart the `Projection`.
This can be useful if the projection was stuck with errors on a specific offset and should skip
that offset and continue with next. Note that when the projection is restarted it will continue from
the next offset that is greater than the stored offset.
22. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/projection/scaladsl/ProjectionManagement.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Extension](https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/Extension.html#akka.actor.typed.Extension)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.13/akka/actor/typed/Extension.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/ProjectionId.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/ActorHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/AtLeastOnceFlowProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/AtLeastOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/AtMostOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/ExactlyOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/GroupedProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/HandlerLifecycle.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/MergeableOffsetSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/ProjectionManagement$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/ProjectionManagement.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/StatefulHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/VerifiableSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/ProjectionManagement.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/ProjectionManagement.html)*