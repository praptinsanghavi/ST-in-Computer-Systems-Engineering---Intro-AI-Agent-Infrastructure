---
description: Akka Projection 1.5.9 - akka.projection.scaladsl.ProjectionManagement
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:43:33Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ProjectionManagement$.html
title: Akka Projection 1.5.9 - akka.projection.scaladsl.ProjectionManagement
---

# Akka Projection 1.5.9 - akka.projection.scaladsl.ProjectionManagement

> **Summary:** Akka Projection 1.5.9 - akka.projection.scaladsl.ProjectionManagement

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
- [ExactlyOnceProjection](ExactlyOnceProjection.html)
- [GroupedProjection](GroupedProjection.html)
- [Handler](Handler.html "Implement this interface for the Envelope handler in the Projection.")
- [HandlerLifecycle](HandlerLifecycle.html)
- [MergeableOffsetSourceProvider](MergeableOffsetSourceProvider.html)
- [ProjectionManagement](ProjectionManagement.html)
- [SourceProvider](SourceProvider.html)
- [StatefulHandler](StatefulHandler.html)
- [VerifiableSourceProvider](VerifiableSourceProvider.html)
[o](ProjectionManagement.html "See companion class")[akka](../../index.html).[projection](../index.html).[scaladsl](index.html)

# [ProjectionManagement](ProjectionManagement.html "See companion class")[**](../../../akka/projection/scaladsl/ProjectionManagement$.html "Permalink")

### Companion [class ProjectionManagement](ProjectionManagement.html "See companion class")

#### object ProjectionManagement extends [ExtensionId](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ExtensionId.html#akka.actor.typed.ExtensionId)\[[ProjectionManagement](ProjectionManagement.html)]

Source[ProjectionManagement.scala](https://github.com/akka/akka-projection/tree/v1.5.9/akka-projection-core/src/main/scala/akka/projection/scaladsl/ProjectionManagement.scala#L27)Linear Supertypes[ExtensionId](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ExtensionId.html#akka.actor.typed.ExtensionId)\[[ProjectionManagement](ProjectionManagement.html)], [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ProjectionManagement
2. ExtensionId
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#apply(system:akka.actor.typed.ActorSystem[_]):T "Permalink") final  def apply(system: [ActorSystem](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [ProjectionManagement](ProjectionManagement.html)Definition ClassesExtensionId
5. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#createExtension(system:akka.actor.typed.ActorSystem[_]):akka.projection.scaladsl.ProjectionManagement "Permalink")  def createExtension(system: [ActorSystem](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [ProjectionManagement](ProjectionManagement.html)Definition ClassesProjectionManagement → ExtensionId
8. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesExtensionId → AnyRef → Any
10. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#get(system:akka.actor.typed.ActorSystem[_]):akka.projection.scaladsl.ProjectionManagement "Permalink")  def get(system: [ActorSystem](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html#akka.actor.typed.ActorSystem)\[\_]): [ProjectionManagement](ProjectionManagement.html)
11. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesExtensionId → AnyRef → Any
13. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#id:akka.actor.typed.ExtensionId[T] "Permalink")  def id: [ExtensionId](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ExtensionId.html#akka.actor.typed.ExtensionId)\[[ProjectionManagement](ProjectionManagement.html)]Definition ClassesExtensionId
14. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/projection/scaladsl/ProjectionManagement$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionId](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ExtensionId.html#akka.actor.typed.ExtensionId)\[[ProjectionManagement](ProjectionManagement.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
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
- https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ExtensionId.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ProjectionManagement$.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/ProjectionManagement$.html)*