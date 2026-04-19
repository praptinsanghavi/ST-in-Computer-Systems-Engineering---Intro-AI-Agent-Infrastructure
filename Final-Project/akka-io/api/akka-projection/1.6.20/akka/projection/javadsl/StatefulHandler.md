---
description: Akka Projection 1.6.20 - akka.projection.javadsl.StatefulHandler
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:38:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/StatefulHandler.html
title: Akka Projection 1.6.20 - akka.projection.javadsl.StatefulHandler
---

# Akka Projection 1.6.20 - akka.projection.javadsl.StatefulHandler

> **Summary:** Akka Projection 1.6.20 - akka.projection.javadsl.StatefulHandler

## Content

Akka Projection1\.6\.20 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/projection/index.html "Permalink")  package [projection](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/projection/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[projection](../index.html)
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
- StatefulHandler
- [VerifiableSourceProvider](VerifiableSourceProvider.html)
c[akka](../../index.html).[projection](../index.html).[javadsl](index.html)

# StatefulHandler[**](../../../akka/projection/javadsl/StatefulHandler.html "Permalink")

### 

#### abstract  class StatefulHandler\[State, Envelope] extends [Handler](Handler.html)\[Envelope]

Source[StatefulHandler.scala](https://github.com/akka/akka-projection/tree/v1.6.20/akka-projection-core/src/main/scala/akka/projection/javadsl/StatefulHandler.scala#L11)Linear Supertypes[Handler](Handler.html)\[Envelope], [HandlerLifecycle](HandlerLifecycle.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StatefulHandler
2. Handler
3. HandlerLifecycle
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/projection/javadsl/StatefulHandler.html#<init>():akka.projection.javadsl.StatefulHandler[State,Envelope] "Permalink")  new StatefulHandler()
### Abstract Value Members

1. [**](../../../akka/projection/javadsl/StatefulHandler.html#initialState():java.util.concurrent.CompletionStage[State] "Permalink") abstract  def initialState(): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[State]Invoked to load the initial state when the projection is started or if previous `process` failed.
2. [**](../../../akka/projection/javadsl/StatefulHandler.html#process(state:State,envelope:Envelope):java.util.concurrent.CompletionStage[State] "Permalink") abstract  def process(state: State, envelope: Envelope): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[State]The `process` method is invoked for each `Envelope`.

The `process` method is invoked for each `Envelope`.
One envelope is processed at a time. The returned `CompletionStage<State>` is to be completed when the processing
of the `envelope` has finished. It will not be invoked with the next envelope until after the returned
`CompletionStage` has been completed.

The `state` is the completed value of the previously returned `CompletionStage<State>` or the `initialState`.
If the previously returned `CompletionStage<State>` failed it will call `initialState`
again and use that value.

Annotations@throws(classOf\[Exception])
### Concrete Value Members

1. [**](../../../akka/projection/javadsl/StatefulHandler.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/projection/javadsl/StatefulHandler.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/projection/javadsl/StatefulHandler.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/projection/javadsl/StatefulHandler.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/projection/javadsl/StatefulHandler.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @IntrinsicCandidate() @native()
6. [**](../../../akka/projection/javadsl/StatefulHandler.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/projection/javadsl/StatefulHandler.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/projection/javadsl/StatefulHandler.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
9. [**](../../../akka/projection/javadsl/StatefulHandler.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@IntrinsicCandidate() @native()
10. [**](../../../akka/projection/javadsl/StatefulHandler.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/projection/javadsl/StatefulHandler.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/projection/javadsl/StatefulHandler.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
13. [**](../../../akka/projection/javadsl/StatefulHandler.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@IntrinsicCandidate() @native()
14. [**](../../../akka/projection/javadsl/StatefulHandler.html#process(envelope:Envelope):java.util.concurrent.CompletionStage[akka.Done] "Permalink") final  def process(envelope: Envelope): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]Calls `process(state, envelope)` with the completed value of the previously returned `CompletionStage<State>`
or the `initialState`.

Calls `process(state, envelope)` with the completed value of the previously returned `CompletionStage<State>`
or the `initialState`. If the previously returned `CompletionStage<State>` failed it will call `initialState`
again and use that value.

Definition ClassesStatefulHandler → [Handler](Handler.html)
15. [**](../../../akka/projection/javadsl/StatefulHandler.html#start():java.util.concurrent.CompletionStage[akka.Done] "Permalink") final  def start(): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]Calls [StatefulHandler.initialState](#initialState():java.util.concurrent.CompletionStage[State]) when the projection is started.

Calls [StatefulHandler.initialState](#initialState():java.util.concurrent.CompletionStage[State]) when the projection is started.

Definition ClassesStatefulHandler → [Handler](Handler.html) → [HandlerLifecycle](HandlerLifecycle.html)
16. [**](../../../akka/projection/javadsl/StatefulHandler.html#stop():java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def stop(): [CompletionStage](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html#akka.Done)]Invoked when the projection has been stopped.

Invoked when the projection has been stopped. Can be overridden to implement resource
cleanup. It is also called when the `Projection` is restarted after a failure.

Definition Classes[Handler](Handler.html) → [HandlerLifecycle](HandlerLifecycle.html)
17. [**](../../../akka/projection/javadsl/StatefulHandler.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../akka/projection/javadsl/StatefulHandler.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base//java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../../akka/projection/javadsl/StatefulHandler.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../../akka/projection/javadsl/StatefulHandler.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
21. [**](../../../akka/projection/javadsl/StatefulHandler.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/projection/javadsl/StatefulHandler.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Handler](Handler.html)\[Envelope]

### Inherited from [HandlerLifecycle](HandlerLifecycle.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.13/akka/Done.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/ActorHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/AtLeastOnceFlowProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/AtLeastOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/AtMostOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/ExactlyOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/GroupedProjection.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/Handler$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/HandlerLifecycle.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/MergeableOffsetSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/ProjectionManagement$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/ProjectionManagement.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/StatefulHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/VerifiableSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.6.20/index.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/StatefulHandler.html](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/StatefulHandler.html)*