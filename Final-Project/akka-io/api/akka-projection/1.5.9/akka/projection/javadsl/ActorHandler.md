---
description: Akka Projection 1.5.9 - akka.projection.javadsl.ActorHandler
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:43:42Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/ActorHandler.html
title: Akka Projection 1.5.9 - akka.projection.javadsl.ActorHandler
---

# Akka Projection 1.5.9 - akka.projection.javadsl.ActorHandler

> **Summary:** Akka Projection 1.5.9 - akka.projection.javadsl.ActorHandler

## Content

Akka Projection1\.5\.9 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/projection/index.html "Permalink")  package [projection](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/projection/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[projection](../index.html)
- ActorHandler
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
c[akka](../../index.html).[projection](../index.html).[javadsl](index.html)

# ActorHandler[**](../../../akka/projection/javadsl/ActorHandler.html "Permalink")

### 

#### abstract  class ActorHandler\[Envelope, T] extends [Handler](Handler.html)\[Envelope]

This [Handler](Handler.html) gives support for spawning an actor of a given `Behavior` to delegate
processing of the envelopes to the actor.

The lifecycle of the actor is managed by the `Projection`. The `behavior` is spawned when the
`Projection` is started and the `ActorRef` is passed in as a parameter to the `process` method.
The Actor is stopped when the `Projection` is stopped.

Source[ActorHandler.scala](https://github.com/akka/akka-projection/tree/v1.5.9/akka-projection-core/src/main/scala/akka/projection/javadsl/ActorHandler.scala#L21)Linear Supertypes[Handler](Handler.html)\[Envelope], [HandlerLifecycle](HandlerLifecycle.html), [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ActorHandler
2. Handler
3. HandlerLifecycle
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/projection/javadsl/ActorHandler.html#<init>(behavior:akka.actor.typed.Behavior[T]):akka.projection.javadsl.ActorHandler[Envelope,T] "Permalink")  new ActorHandler(behavior: [Behavior](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/Behavior.html#akka.actor.typed.Behavior)\[T])
### Abstract Value Members

1. [**](../../../akka/projection/javadsl/ActorHandler.html#process(actor:akka.actor.typed.ActorRef[T],envelope:Envelope):java.util.concurrent.CompletionStage[akka.Done] "Permalink") abstract  def process(actor: [ActorRef](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorRef.html#akka.actor.typed.ActorRef)\[T], envelope: Envelope): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka/2.9.6/akka/Done.html#akka.Done)]The `process` method is invoked for each `Envelope`.

The `process` method is invoked for each `Envelope`.
One envelope is processed at a time. The returned `CompletionStage` is to be completed when the processing
of the `envelope` has finished. It will not be invoked with the next envelope until after the returned
`CompletionStage` has been completed.

The `behavior` is spawned when the `Projection` is started and the `ActorRef` is passed in as
a parameter here.

You will typically use the `AskPattern.ask` to delegate the processing of the `envelope` to
the actor and the returned `CompletionStage` corresponds to the reply of the `ask`.

Annotations@throws(classOf\[Exception])
### Concrete Value Members

1. [**](../../../akka/projection/javadsl/ActorHandler.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/projection/javadsl/ActorHandler.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/projection/javadsl/ActorHandler.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/projection/javadsl/ActorHandler.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/projection/javadsl/ActorHandler.html#behavior:akka.actor.typed.Behavior[T] "Permalink")  val behavior: [Behavior](https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/Behavior.html#akka.actor.typed.Behavior)\[T]
6. [**](../../../akka/projection/javadsl/ActorHandler.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/projection/javadsl/ActorHandler.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/projection/javadsl/ActorHandler.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/projection/javadsl/ActorHandler.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/projection/javadsl/ActorHandler.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/projection/javadsl/ActorHandler.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/projection/javadsl/ActorHandler.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.15/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/projection/javadsl/ActorHandler.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/projection/javadsl/ActorHandler.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/projection/javadsl/ActorHandler.html#process(envelope:Envelope):java.util.concurrent.CompletionStage[akka.Done] "Permalink") final  def process(envelope: Envelope): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka/2.9.6/akka/Done.html#akka.Done)]The `process` method is invoked for each `Envelope`.

The `process` method is invoked for each `Envelope`.
One envelope is processed at a time. The returned `CompletionStage` is to be completed when the processing
of the `envelope` has finished. It will not be invoked with the next envelope until after the returned
`CompletionStage` has been completed.

Definition ClassesActorHandler → [Handler](Handler.html)
16. [**](../../../akka/projection/javadsl/ActorHandler.html#start():java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def start(): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka/2.9.6/akka/Done.html#akka.Done)]Invoked when the projection is starting, before first envelope is processed.

Invoked when the projection is starting, before first envelope is processed.
Can be overridden to implement initialization. It is also called when the `Projection`
is restarted after a failure.

Definition Classes[Handler](Handler.html) → [HandlerLifecycle](HandlerLifecycle.html)
17. [**](../../../akka/projection/javadsl/ActorHandler.html#stop():java.util.concurrent.CompletionStage[akka.Done] "Permalink")  def stop(): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka/2.9.6/akka/Done.html#akka.Done)]Invoked when the projection has been stopped.

Invoked when the projection has been stopped. Can be overridden to implement resource
cleanup. It is also called when the `Projection` is restarted after a failure.

Definition Classes[Handler](Handler.html) → [HandlerLifecycle](HandlerLifecycle.html)
18. [**](../../../akka/projection/javadsl/ActorHandler.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../akka/projection/javadsl/ActorHandler.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../akka/projection/javadsl/ActorHandler.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.15/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../akka/projection/javadsl/ActorHandler.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.15/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../akka/projection/javadsl/ActorHandler.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/projection/javadsl/ActorHandler.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.15/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Handler](Handler.html)\[Envelope]

### Inherited from [HandlerLifecycle](HandlerLifecycle.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.15/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.15/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/ActorHandler.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/AtLeastOnceFlowProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/AtLeastOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/AtMostOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/ExactlyOnceProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/GroupedProjection.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/Handler$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/HandlerLifecycle.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/MergeableOffsetSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/ProjectionManagement$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/ProjectionManagement.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/StatefulHandler.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/VerifiableSourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/index.html
- https://doc.akka.io/api/akka-projection/1.5.9/index.html
- https://doc.akka.io/api/akka/2.9.6/akka/Done.html
- https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka/2.9.6/akka/actor/typed/Behavior.html

---
*Source: [https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/ActorHandler.html](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/ActorHandler.html)*